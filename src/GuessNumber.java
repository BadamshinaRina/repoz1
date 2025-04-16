import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main (Exam[] args) {

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt (10) + 1;

        Scanner console = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число: ");
            //сохраняем введённое пользователем число в переменной userInput
            int userInput = console.nextInt();

            //проверяем условие и выводим сообщения
            if (userInput == randInt) {
                System.out.println ("Совершенно верно! Это и есть загаданное мною число!");
                break;
            }
            else if (userInput > randInt)
            {
                System.out.println ("Загаданное мною число меньше.");
            }
            else
            {
                System.out.println ("Загаданное мною число больше.");
            }
        }
    }
}