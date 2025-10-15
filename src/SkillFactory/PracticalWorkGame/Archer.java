package SkillFactory.PracticalWorkGame;

public class Archer extends Hero{
    private static final double dodgeChance  = 0.25;
    private static final double criticalBonus  = 0.1;

    public Archer(String name) {
        super(name, 80,30,0,12,15);
    }

    public Archer(String name, int healthUnits, int gold, int experience, int power, int dexterity) {
        super(name, healthUnits, gold, experience, power, dexterity);
    }

    @Override
    public int attack() {
        int damage = super.attack();
        if(damage>0&&Math.random()<criticalBonus) {
            damage*=2;
            System.out.println(getName() + " совершает критический удар!");
        }
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        if(Math.random()<dodgeChance) {
            System.out.println(getName() + " уворачивается от атаки");
            return;
        }
        super.takeDamage(damage);
    }
}
