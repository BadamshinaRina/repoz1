package SkillFactory.PracticalWorkGame;

public class Hero extends Character implements Buyer{
    private int potions = 0;
    private int maxHealth;
    public Hero(String name, int healthUnits, int gold, int experience, int power, int dexterity) {
        super(name, healthUnits, gold, experience, power, dexterity);
        this.maxHealth=healthUnits;
        this.potions=3;
    }

    @Override
    public void spendGold(int amount) {
        setGold(getGold()-amount);
        System.out.println("Потрачено золота " + amount + ". Всего золота " + getGold());
    }

    @Override
    public void addGold(int amount) {
        setGold(getGold()+amount);
        System.out.println("Получено золота " + amount + ". Всего золота " + getGold());
    }

    @Override
    public void addPotion() {
        potions++;
        System.out.println("Получено зелье. Всего "+ potions);

    }

    @Override
    public int getPotion() {
        return potions;
    }

    @Override
    public void usePotion() {
        if(potions>0) {
            potions--;
            int healthAmount=50;
            setHealthUnits(Math.min(getHealthUnits()+healthAmount, maxHealth));
            System.out.println(" Использовано зелье! Уровень вашего здоровья " + getHealthUnits());
        }
        else System.out.println("Нет зелий");
    }

    @Override
    public void increaseMaxHealth(int amount) {
       this.maxHealth= maxHealth+amount;
       setHealthUnits(getHealthUnits()+amount);
        System.out.println("Максимальное здоровье увеличено на " + amount);
    }

    public void showInventory() {
        System.out.println("\n Инвентарь героя:");
        System.out.println("Здоровье: " + getHealthUnits());
        System.out.println("Золото: " + getGold());
        System.out.println("Количество зелий: " + getPotion());
        System.out.println("Ловкость: " + getDexterity());
        System.out.println("Опыт: " + getExperience());
        System.out.println("Сила: " + getPower());
    }
}
