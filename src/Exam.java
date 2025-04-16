public class Exam {
    public static void main(String[] args) {
        String a = "Иван Иванов";
        String b = "Иван ванов";
        checkUserName(a, b);
    }
    private static void checkUserName(String a, String b) {

    if (a.equalsIgnoreCase(b)==true)
        System.out.println("Выберите другое имя");

    else
        System.out.println("Отличное имя. " + "Ваше имя имеет длину " + a.length() + " символов");
    }
}
