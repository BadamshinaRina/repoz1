package modul4;

public class array3 {
    public static void main(String[] args) {
    double [] num  = {1.3, 56.5, 69.5, 56.4, 98.7};
    for (int i = 0; i<num.length; i++)
        {
            System.out.println(num[i] + "");
        }
    double result = 0;
    for (int i=0; i< num.length; i++) {
        result += num [i];
    }
        System.out.println("summa vsego massiva " + result);
    double max =0;
    for (int i=0; i< num.length; i++) {
        if (num[i] > max) max = num[i];
    }
        System.out.println("maksimum " + max);
    }
}
