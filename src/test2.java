public class test2 {
    public static void main(Exam[] args) {
        int a =5, b = 8;
        int result1 = 0, result2 = 0;
        result1 = a-- - --a + ++a + a++ +a;
        result2 = ++b - b++ + ++b - --b;
        System.out.println(result1);
        System.out.println(result2);
    }
}
