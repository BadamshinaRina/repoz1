package Zaur;

public class Lesson8_1 {


        static final double Pi=3.14;

        public double areaCircle(double rad) {
            double Area = Pi*rad*rad;
            System.out.println("Площадь круга: " + Area);
            return Area;
        }

        public static double lenghtCircle(double rad) {
            double lenght=2*rad*Pi;
            System.out.println("Длина окружности: "+ lenght);
            return lenght;
        }

        public void Info (double rad) {
            double Area = Pi*rad*rad;
            double lenght=2*rad*Pi;
            System.out.println("Площадь круга: " + Area + ", " + "Длина окружности: " + lenght + ", " + "радиус: " + rad);
        }

    public static void main(String[] args) {


        Lesson8_1 L1 = new Lesson8_1();
        L1.areaCircle(12.5);
        L1.Info(14.5);

        lenghtCircle(16.5);
        lenghtCircle(17.5);
        lenghtCircle(18.5);




    }

}
