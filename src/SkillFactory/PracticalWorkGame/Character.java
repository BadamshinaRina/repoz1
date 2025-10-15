package SkillFactory.PracticalWorkGame;

public abstract class Character implements Fighter{

    private String name;
    private int healthUnits;
    private int gold;
    private int experience; //опыт
    private int power;
    private int dexterity;//ловкость
    private static final int DEXTERITY_MULTIPLIER = 3;
    private static final double MAX_RANDOM = 100.0;

    public Character(String name, int healthUnits, int gold, int experience, int power, int dexterity) {
        this.name = name;
        this.healthUnits = healthUnits;
        this.gold = gold;
        this.experience = experience;
        this.power = power;
        this.dexterity = dexterity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthUnits() {
        return healthUnits;
    }

    public void setHealthUnits(int healthUnits) {
        this.healthUnits = Math.max(0, healthUnits);
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = Math.max(0, gold);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    @Override
    public String toString() {
        return String.format("%s [HP: %d, Gold: %d, Exp: %d, Power: %d, Dex: %d]",
                name, healthUnits, gold, experience, power, dexterity);
    }

    @Override
    public int attack() {
        if (getDexterity() * DEXTERITY_MULTIPLIER > Math.random() * 100) {
            return calculateDamage();
        }
        return 0;
    }

    private int calculateDamage() {
        // Шанс крита растет с уровнем (опытом)
        int level = getExperience() / 100; // пример расчета уровня
        double criticalChance = 0.05 + (level * 0.01); // +1% за уровень

        // Множитель тоже может расти
        int critMultiplier = 2 + (level / 5); // +0.2 за каждые 5 уровней

        if (Math.random() < criticalChance) {
            System.out.printf("Критический удар! (шанс: %.1f%%) x%d%n",
                    criticalChance * 100, critMultiplier);
            return getPower() * critMultiplier;
        }
        return getPower();
    }

    public boolean isAlive() {
        return healthUnits > 0;
    }

    public void takeDamage(int damage) {
        this.healthUnits = Math.max(0, this.healthUnits - damage);
    }
}


