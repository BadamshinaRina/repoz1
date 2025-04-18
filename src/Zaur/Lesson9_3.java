package Zaur;

public class Lesson9_3 {
    int a=1;
    static int b=2;

    void abc (int a) {
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Lesson9_3.b);
    }

    public static void main(String[] args) {
        Lesson9_3 L=new Lesson9_3();
        L.abc(4);
        L.abc(6);
    }
}
