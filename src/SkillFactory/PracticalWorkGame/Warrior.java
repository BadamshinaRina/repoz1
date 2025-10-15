package SkillFactory.PracticalWorkGame;

public class Warrior extends Hero{
    private static final double blockChance  = 0.2;


    public Warrior(String name) {
        super(name, 120, 50, 0, 15, 8);
    }

    public Warrior(String name, int healthUnits, int gold, int experience, int power, int dexterity) {
        super(name, healthUnits, gold, experience, power, dexterity);
    }

    @Override
    public void takeDamage(int damage) { //воин будет блокировать удар щитом
        if(Math.random()<blockChance) {
            System.out.println(getName() + " блокирует удар щитом");
            damage = Math.max(1, damage/2);
        }
        super.takeDamage(damage);
    }

    @Override
    public int attack() {//воин может атаковать мощно
        if(Math.random()<0.15) {
            System.out.println(getName() + " произвел мощную атаку");
            int baseDamage = super.attack();
            return baseDamage>0? baseDamage+5:0;
        }
        return super.attack();
    }
}
