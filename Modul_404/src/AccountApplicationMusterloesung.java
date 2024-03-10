import java.util.Scanner;

public class AccountApplicationMusterloesung {
  public void start() {
	  
    System.out.println("Welcome to the account application");
    Account account = new Account();  // hier wird ein Objekt der Klasse `Account` erstellt
    double amount = 0;
    String command = "";

    try(Scanner scanner = new Scanner(System.in)) {
        do {
          System.out.println("Please enter the amount, 0 (zero) to terminate");
          amount = scanner.nextDouble();
          if (amount != 0) {
            System.out.println("To deposit, press +, to withdraw press -");
            command = scanner.next();
            if ("+".equals(command)) {
              account.deposit(amount); // nun wird das Objekt "account" verwendet
            } else if ("-".equals(command)) {
              account.withdraw(amount); // nun wird das Object "account" verwendet
            }
          }
        } while (amount != 0);
        // Die balance/Kontostand wird direkt im Objekt "account" berechnet
        System.out.println("Final balance: " + account.getBalance());
    }
  }
}
