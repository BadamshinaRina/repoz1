package modul5;

public class Cat {

    private double weight;
    private String name;
    private int age;
    private String color;

    //Конструктор по умолчанию
    public Cat() {
        this(3000, "Barsik", 10, "Grey");
    }

    //Конструктор, принимающий параметры
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //кошки не молодеют!
        if (age > this.age)
            this.age = age;
        else {
            System.out.println("ВВедите правильный возраст животного");
        }
    }

    public String getColor() {
        return color;
    }
    //метод только для садистов
    public void setColor(String color) {
        this.color = color;
        //и так жалобно
        meow(); meow(); meow();
    }
    public void meow() {
        System.out.println("Meow");
    }

    private void pee() {
        weight -= 20;
        System.out.println("Почисти лоток");
    }

    public void eat() {
        weight += 50;
        //сами вызываем свою функцию, если надо
        if (50 / weight > .01)
            pee();
        System.out.println("Спасибо было вкусно");
    }
}

