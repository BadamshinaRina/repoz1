package Zaur;

public class BankAccount {
    int id;
    double balance;
    String name;

    double PopolnenieScheta (double razmerScheta) {
       balance +=razmerScheta;
        return razmerScheta;
    }

       double SnatieSoScheta (double razmerScheta) {
            balance -= razmerScheta;
           return razmerScheta;
        }
        void  ShowSchet () {
            System.out.println(" Упользователя " + name + "  баланс карты: " + balance);
        }
    }

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.name = "Petr Ivanov";
        account1.balance = 100.36;

        account1.ShowSchet();
        account1.SnatieSoScheta(50.5);
        account1.ShowSchet();
        account1.PopolnenieScheta(900.89);
        account1.ShowSchet();


    }
}
