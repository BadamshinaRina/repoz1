package Zaur;

public class Student {
    int NumberTicket;
    String name;
    String surname;
    int StudyYears;
    double estMath;
    double estEconom;
    double estLang;

    double sredneeArif (double estEconom, double estLang, double estMath) {
        double result = (estEconom+estLang+estMath)/3;
        return result;
    }

    public Student(int NumberTicket1, String name1, String surname1, int StudyYears1) {
        NumberTicket1=NumberTicket;
        name1=name;
        surname1=surname;
        StudyYears1=StudyYears;
    }
    public Student (int NumberTicket1, String name1, String surname1) {

        this(NumberTicket1, name1,surname1,0);
    }

    public Student (String name1) {
        this(0, name1,null,0);

    }




}
        class StudentTest {
            public static void main(String[] args) {

            Student S1 = new Student("Ivan");
            Student S2 = new Student(123, "Petr", "Samsonov");
            Student S3 =new Student(456,"Maikl", "Petrov", 2020);



        }
    }


