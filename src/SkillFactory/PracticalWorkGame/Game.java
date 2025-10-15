package SkillFactory.PracticalWorkGame;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private Hero hero;
    private Scanner scanner;
    private Random random;
    private boolean gameRunning;
    private Merchant merchant;

    public Game() {
        this.scanner =  new Scanner(System.in);
        this.random = new Random();
        this.gameRunning = true;
        this.merchant = new Merchant();
    }

    public void start() {
        System.out.println("======Добро пожаловать в RPG игру=====");
        createCharacter();
        while (gameRunning&& hero.isAlive()) {
            showMainMenu();
        }
        if (!hero.isAlive()) {
            System.out.println("Ваша игра окончена, герой погиб!");
        }
        else {
            System.out.println("До свидания! \n Игра окончена!");
        }

    }

    public void createCharacter() {
        System.out.println("СОЗДАНИЕ ПЕРСОНАЖА!\n Введите имя вашего персонажа: ");
        String nameHero = scanner.nextLine();

        System.out.println("Выберите класс вашего героя: ");
        System.out.println("1. Воин (Высокое здоровье, средний урон)");
        System.out.println("2. Лучник (Среднее здоровье, высокий шанс крита)");
        System.out.println("3. Маг (Низкое здоровье, высокий урон)");

        int heroChoise = getIntInput(1,4);

        switch (heroChoise){
            case 1: hero= new Warrior(nameHero);
            break;
            case 2: hero= new Archer(nameHero);
            break;
            case 3: hero = new Mage(nameHero);
            break;
        }
        System.out.println("Персонаж создан " + hero);
    }

    private int getIntInput (int min, int max) {
        while (true) {
            try{
                System.out.println("Ваш выбор: ");
                int input = Integer.parseInt(scanner.nextLine());
                if(input<=max&&input>=min) {
                    return input;
                }
                else {
                    System.out.println(" пожалуйста введите число от "+ min + " до " + max);
                }
            }
            catch (NumberFormatException e) {
                System.out.println(" Пожалуйста введите корректное число");
            }
        }
    }

    private void showMainMenu() {
        System.out.println("=====ГЛАВНОЕ МЕНЮ: =======");
        System.out.println(hero + " куда вы хотите пойти?");
        System.out.println("1. К торговцу.\n 2. В темный лес. \n 3. Выйти из игры");

        int choice = getIntInput(1,3);
        switch (choice) {
            case 1: goToMerchant();
            break;
            case 2: goToDarkForest();
            break;
            case 3: gameRunning=false;
            break;

        }
    }

    private void goToMerchant() {
        System.out.println("====== ЛАВКА ТОРГОВЦА: ======");
        boolean inShop=true;
        while (inShop&&hero.isAlive()) {
            merchant.showGoods();
            System.out.println(" Вaше золото " + hero.getGold()+ "\n");
            System.out.println("1. Купить товар\n 2.Показать инвентарь. \n 3.Использовать зелье \n 4.Вернуться в город. ");

            int choise = getIntInput(1,4);

            switch (choise) {
                case 1: buyFromMerchant();
                break;
                case 2: hero.showInventory();
                break;
                case 3: hero.usePotion();
                break;
                case 4: inShop=false;
                break;
            }
        }
    }

    private void goToDarkForest() {
        System.out.println("====== Вы входите в темный лес!======");
        boolean inForest = true;

        while (inForest&&hero.isAlive()) {
            System.out.println("====== Что будем делать?======");
            System.out.println("1. Искать противника?");
            System.out.println("2. Вернуться в город");

            int choise= getIntInput(1,2);
            switch (choise) {
                case 1: startRandomBattle();
                if (hero.isAlive()) {
                    System.out.println("====== Продолжить исследовать лес?======");
                    System.out.println("1. Продолжить бой?");
                    System.out.println("2. Вернуться в город");

                    int choise2 = getIntInput(1,2);
                    if(choise2==2) {
                        inForest=false;
                    }
                    else {
                        startRandomBattle();
                    }
                    break;
                }
                case 2: inForest=false;
                break;
            }
        }
    }

    private void buyFromMerchant(){
        System.out.println("====== Что хотите купить? ======");
        merchant.showGoods();
        System.out.println((merchant.getGoods().length+1) + ". Вернуться. ");

        int choise = getIntInput(1, merchant.getGoods().length+1);
       if (choise<=merchant.getGoods().length) {
           Merchant.Goods selectedGold = merchant.getGoods()[choise-1];
           String result = merchant.sell(selectedGold,hero);
           System.out.println(result);
       }
    }

    private void startRandomBattle() {
        Character monster = random.nextBoolean()? new Skeleton() : new Goblin();
        System.out.println(" Вы встретили " + monster.getName());
        System.out.println(monster);

        Battle battle = new Battle(hero, monster);
        Thread battleThread = new Thread(battle);

        try{
           battleThread.start();
           battleThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(hero.isAlive()) {
            System.out.println(" ВЫ ПОБЕДИЛИ! ");
            System.out.println(" Получено золота " + monster.getGold() + " и опыта " + monster.getExperience());
            hero.addGold(monster.getGold());
            hero.setExperience(hero.getExperience()+ monster.getExperience());

            if(random.nextDouble()<0.3) {
                hero.addPotion();
                System.out.println("Вы нашли зелье здоровья!");
            }

        }
        else System.out.println(" Вы были побеждены в бою :'(");
    }

    public static void main(String[] args) {

        Game myGame = new Game();
        myGame.start();

    }
}
