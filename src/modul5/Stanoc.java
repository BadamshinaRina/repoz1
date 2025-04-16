package modul5;

public class Stanoc {
    int ostatocMasla;
    String name;

    public Stanoc(String name, int ostatocMasla) {
        this.name = name;
        this.ostatocMasla = ostatocMasla;
    }


    public int rashodMasla (int a) {
        ostatocMasla-=a;
        if (ostatocMasla<=0)
        ostatocMasla=0; {
            System.out.println("Нужна заправка" + " " + "для станка с названием: " + name);
        }
        if (ostatocMasla>0) {
            System.out.println("Расход масла для станка: " + " "+ name + " равен: " + a + " литров");
        }
        return ostatocMasla;
    }
    public int zapravkaMasla (int b) {
        ostatocMasla+=b;
        System.out.println("Станок с названием: " + " " + name + " " + "заправлен на " + " " + b + " " + "литров");
        return ostatocMasla;
    }

    void Show () {
        System.out.println("У станка: " + name + " " + "осталось масла: " + ostatocMasla + " " + "литров");
    }

    public static void main(String[] args) {
        Stanoc s1 = new Stanoc("Stanoc1", 100);
        Stanoc s2 = new Stanoc("Stanoc2", 50);

        s1.rashodMasla(110);
        s1.Show();
        s2.Show();
        s1.zapravkaMasla(100);
        s1.Show();
        s2.rashodMasla(25);



    }
}


