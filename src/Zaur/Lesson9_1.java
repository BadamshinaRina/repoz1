package Zaur;

public class Lesson9_1 {
    int a=1;
    static int b=2;

    static void abc (final  int a) {
        System.out.println(a);
        System.out.println(Lesson9_1.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}
