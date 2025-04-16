public class CalculPerimetr {
    public static void main(Exam[] args) {
        int sideTriangle = 5;
        int sideSquare = 4;
        int radius = 5;
        System.out.println("Perimetr triangle = " + PerimeterTriangle(sideTriangle));
        System.out.println("Perimetr square = " + PerimeterSquare(sideSquare));
        System.out.println("Perimetr circle = " + PerimeterCircle(radius));
    }
    public static int PerimeterTriangle(int lenght) {
        int a = 3 * lenght;
        return a;
    }
    public static int PerimeterSquare(int lenght) {
        int a = 4 * lenght;
        return a;
    }
    public static int PerimeterCircle(int radius) {
       double PI = 3.14;
        double b = 2 * radius * PI;
        return (int) b;
    }
}
