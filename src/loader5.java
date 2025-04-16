public class loader5 {
    public static void main(Exam[] args) {
        int a = 30;
        int b = 0; {
            while ( a > 0 ) {
                a--;
                if (a % 10 != 0) {
                    b++;
                }
                System.out.println("pervoe vedro " + a + " Lt");
                System.out.println("vtoroe vedro " + b);
            }
        }
    }
}
