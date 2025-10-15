package SkillFactory.PracticalWorkGame;

public class Battle implements Runnable{
    private Character hero;
    private Character monster;
    private boolean battleFinished;

    public Battle(Character hero, Character monster) {
        this.hero = hero;
        this.battleFinished = false;
        this.monster = monster;
    }

    @Override
    public void run() {
        System.out.println("=========НАЧАЛО БОЯ=======");
        boolean firstAttack = hero.getDexterity()>= monster.getDexterity();

        while (!battleFinished&& hero.isAlive()&& monster.isAlive()) {
            if(firstAttack) {
                executeTurn(hero, monster);
            }
            else executeTurn(monster,hero);
        }

        firstAttack=!firstAttack;

        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
                    }

        battleFinished=true;
    }

    private void executeTurn(Character first, Character second) {
        System.out.println(" Первый ход " + first.getName());
        int damage = first.attack();
        if(damage>0) {
            second.takeDamage(damage);

            if(!second.isAlive()) {
                System.out.println(second.getName() + " повержен");
                battleFinished=true;
            }
        }
        System.out.println("Статус "  + hero.toString());

    }

    public boolean isBattleFinished () {
        return battleFinished;
    }
}
