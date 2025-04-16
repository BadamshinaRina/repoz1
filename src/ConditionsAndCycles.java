public class ConditionsAndCycles {

    public static void main(Exam[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c;
        //a = a * b;
        c = a - c;
        //a = a + b;
        a = a - b;
        c = a + b;
        //b = c / a;
        a = b + c;
        a = a + c + b;

        for(int i = 0; i < 20; i++)
        // На    System.out.println("a");пишите здесь свой код
        System.out.println(a);
    }


}
