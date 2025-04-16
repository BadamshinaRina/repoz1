package modul5;

public class Motobike {
    int years;
    String model;
    String color;

    public int getYears() {
        return years;
    }


    public String getModel() {
        return model;
    }

    private Motobike(int years, String model, String color) {
        this.years = years;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public static void main(String[] args) {

        Motobike motobike = new Motobike(2020, "Honda", "red");

        System.out.println(motobike.getColor() + " " + motobike.getModel()  + " " + motobike.getYears());

    }
}
