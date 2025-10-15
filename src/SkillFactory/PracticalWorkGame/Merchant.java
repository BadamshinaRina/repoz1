package SkillFactory.PracticalWorkGame;

public class Merchant implements Seller{


    private int pricePotion=50;//цена зелья
    private int stockPotion=5;//колво зелья
    private int priceElixir=100;

    @Override
    public String sell(Goods goods, Buyer buyer) {
        if(goods==Goods.POTION) {
            return sellPotion(buyer);
        }
        else if(goods==Goods.ELIXIR) {
            return sellElixir(buyer);
        }
        return "Нет такого товара.";
    }

    private String sellPotion(Buyer buyer) {//продажа зелья
        if(stockPotion<0) return "Зелье закончилось.";
        if(buyer.getGold()>=pricePotion) {
            buyer.spendGold(pricePotion);
            buyer.addPotion();
            stockPotion--;
            return " Вот твое зелье здоровья! Осталось золота: " + buyer.getGold();
        }
        else {
            return "У тебя не хватает золота, чтобы купить зелье. Нужно " + pricePotion + " а у тебя осталось " +
                    buyer.getGold() + " золота. ";
        }

    }
    private String sellElixir(Buyer buyer) {//продажа эликсира
        if(buyer.getGold()>=priceElixir) {
            buyer.spendGold(priceElixir);
            buyer.increaseMaxHealth(20);
            return "Эликсир увеличил твое здоровье";
        }
        else {
            return "У тебя не хватает золота на эликсир";
        }
    }
public void restock() {
        this.stockPotion=5;
    System.out.println("Запасы пополнены");
}
public void showGoods () {
    System.out.println(" =======Товары торговца: =======");
    System.out.println(" 1. Зелье здоровья, цена " + pricePotion + ", осталось " + stockPotion);
    System.out.println(" 2. Эликсир силы - 100 золота(+20 к максимальному здоровью)\n");
}

public Goods[] getGoods () {
        return Goods.values();
}
    public enum Goods {
        POTION,
        ELIXIR
    }

}
