public class solution2 {
    public static void main(Exam[] args) {
        int a=0, b=1, c=-9;
        int positiv=0, negativ=0, zero=0;
        if (a>0) positiv++;
        else if (a<0) negativ++;
        else zero++;

        if (b>0) positiv++;
        else if (b<0) negativ++;
        else zero++;

        if (c>0) positiv++;
        else if (c<0) negativ++;
        else zero++;

        System.out.println("positiv " + positiv);
        System.out.println("negativ " + negativ);
        System.out.println("zero " + zero);
    }
}
