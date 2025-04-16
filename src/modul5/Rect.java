package modul5;

class Rect{
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}
  class RectTest{
     public static void main(String[] args) {
        Rect figyra1 = new Rect(20, 50);

         System.out.println(figyra1.getH());
         System.out.println(figyra1.getW());
         System.out.println(figyra1.getS());
     }
 }

