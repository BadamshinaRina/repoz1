package SkillFactory.PracticalWorkGame;

public class Mage extends Hero {
    private int mana = 100;
    private final static int manaCost = 20;
    private final static double spellChance = 0.6;

    public Mage(String name ) {
        super(name, 70,40,0,18,10);
    }
    public Mage(String name, int healthUnits, int gold, int experience, int power, int dexterity) {
        super(name, healthUnits, gold, experience, power, dexterity);
    }

    private int castSpell() {//произношение заклинания
        mana-=mana;
        int spellDamage = getPower() + (int)(Math.random()*10)+5;
        System.out.println(getName() + " читает заклинание и наносит " + spellDamage + " магического урона");
        return spellDamage;
    }

    @Override
    public int attack() {
        if(mana>=manaCost&&Math.random()<spellChance) {
            return castSpell();
        }
        else return super.attack();
    }

    @Override
    public void takeDamage(int damage) {//маг имеет шанс создать магичсекий щит
        if(Math.random()<0.2&&mana>=10){
            mana-=10;
            damage= Math.max(1, damage-5);
            System.out.println(getName()+ " создает магичсекий щит, урон снижен");
        }
        super.takeDamage(damage);
    }
}
