package SkillFactory.PracticalWorkGame;

public interface Buyer {
    int getGold();//ПОлучить золото
   void spendGold(int amount); //потратить золото
    void addGold(int amount); //добавить золото
    void addPotion();//добавить зелье
    int getPotion();//Получить зелье
    void usePotion();//использовать зелье
    void increaseMaxHealth (int amount); //увеличить здоровье


}
