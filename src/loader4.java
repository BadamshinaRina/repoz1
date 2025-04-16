public class loader4 {
    public static void main(Exam[] args) {
        int a = 10;
        while (a > 5) {
            System.out.println(a--);
        }

        int summ = 0;
        int i = 0;
        {
            for (i = 0; i < 50; i++) ;
            {
                summ += i;
            }

            System.out.println(summ);
        }
        switch (summ) {
            case 50:
                System.out.println(50);
                break;
            case 1180:
                System.out.println(1180);
                break;
            case 1225:
                System.out.println(1225);
                break;
            default:
                System.out.println("результат неверный");
        }
        if (a == 5 && summ == 1180) {
            System.out.println("Условие выполнено");
        }
        else {
            System.out.println("Условие не выполнено");
        }

    }

}
