package Zaur;

public class Employee {
    int id;
    private double solary;
    int age;
    public String surname;
    String departmen;

    double ydvoenieZarplati (double indexYdvoenia) {
        solary *=indexYdvoenia;
        return solary;
    }

    public void showInfo1 () {
        System.out.println("Фамилия сотрудника: " + surname);
    }

    public void showInfo2 () {
        System.out.println("Номер сотрудника: " + id);
    }

    public void showInfo3 () {
        System.out.println("Зарплата сотрудника: " + solary);
    }

    public Employee(int id, double solary, int age, String surname) {
        this.id = id;
        this.solary = solary;
        this.age = age;
        this.surname = surname;
    }

    private Employee(int id, double solary, String surname) {
        this.id=id;
        this.solary=solary;
        this.surname=surname;
    }

    Employee (double solary, int id,String surname) {
        this.solary=solary;
        this.id=id;
        this.surname=surname;
    }

}


class EmployeeTest {

    public static void main(String[] args) {

        Employee C1 = new Employee(123, 100.3, 36, "Ivanov");
        Employee C2 = new Employee(456, 450.5, 35, "Petrov");

      //  System.out.println("Фамилия сотрудника: " + C1.surname + ", Возраст сотрудника: " + C1.age +  ", старая зарплата сотрудника: " + C1.solary);
        C1.ydvoenieZarplati(2);
C1.showInfo1();

        System.out.println();

      //  System.out.println("Фамилия сотрудника: " + C2.surname + ", Возраст сотрудника: " + C2.age +  ", старая зарплата сотрудника: " + C2.solary);
        C2.ydvoenieZarplati(2);


    }

}

class EmployeeTest2 {
    public static void main(String[] args) {
        Employee emp= new Employee(123, 500.0, 22, "ivanov");
        emp.showInfo1();
        emp.showInfo3();


    }


}
