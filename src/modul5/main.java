package modul5;

public class main {
    public static  void main(String[] args) {

        Cat cat = new Cat();

        cat.eat();
        cat.meow();
        cat.setColor("white");
        cat.setAge(32);

        System.out.println(cat.getWeight() + " " +  cat.getName() + " " + cat.getColor() + " " + cat.getAge());
        cat.setName("Larisa");
        System.out.println(cat.getWeight() + " " +  cat.getName() + " " + cat.getColor() + " " + cat.getAge());

        final Cat cat2 = new Cat(4000, "kay", 26, "black");
        System.out.println(cat.getWeight() + " " +  cat.getName() + " " + cat.getColor() + " " + cat.getAge());

    }
}
