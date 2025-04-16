package modul4;


import java.util.ArrayList;
import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя");
        String name = scanner.nextLine();
        System.out.println("Создайте пароль");
        String parol = scanner.nextLine();

        if (parol.length() < 8 || parol.length() > 15); {
             do {
                 System.out.println("Длина пароля не соотвествует, пароль не должен быть меньше 8 знаков");
                 parol = scanner.nextLine();
             }
             while (parol.length() < 8 || parol.length() > 15);
        }
        System.out.print("Ваше имя: " + name + "Ваш новый пароль: " + parol);
    }

}
