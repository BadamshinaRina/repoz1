package SkillFactory.PracticalWorkGame;

public class Goblin extends Character{
    public Goblin() {
        super("Гоблин", 50,20,25,10,14);
    }

    @Override
    public int attack() {
        if(Math.random()<0.1) {
            System.out.println(" Гоблин атакует дважды");
            int damage = super.attack();
            int damage2 = super.attack();
            return damage2+damage;

        }
        return super.attack();
    }
}
