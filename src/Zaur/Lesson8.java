package Zaur;

public class Lesson8 {

   public  static int metod1 (int a, int b, int c) {
        return a*b*c;
    }

   public static void metod2 (int a, int b) {
       int res=a/b;
       int rem=a%b;
       System.out.println("Целое число: " + res + " остаток: " + rem);
    }

    public static void main(String[] args) {
    metod1(1,2,3);
    metod2(8, 9);

    }
}
