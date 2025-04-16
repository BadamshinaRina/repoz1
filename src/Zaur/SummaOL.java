package Zaur;

public class SummaOL {
    int a,b,c,d,e;

int summaOL(int a) {
    return summaOL(a,0,0,0,0);
}
int summaOL (int a1,int b) {
    return summaOL(a1,b,0,0,0);

}
int summaOL (int a2, int b1, int c) {
    return summaOL(a2,b1,c,0,0);
}
    int summaOL (int a3, int b2, int c1, int d) {
        return summaOL(a3,b2,c1,d,0);
    }
    int summaOL (int a4, int b3, int c2, int d1, int e) {
    return a4+b3+c2+d1+e;
    }
}


class SummaOLTest {
    public static void main(String[] args) {
        SummaOL s = new SummaOL();

        System.out.println(s.summaOL(0));
        System.out.println(s.summaOL(0,1));
        System.out.println(s.summaOL(0,1,2));
        System.out.println(s.summaOL(0,1,2,3));
        System.out.println(s.summaOL(0,1,2,3,4));

    }
}