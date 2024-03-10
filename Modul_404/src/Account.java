public class Account {
  private double balance;             // englisch für "kontostand"

  public void deposit(double value) { // englisch für "einzahlen"
    balance += value;
  }

  public void withdraw(double value) { // englisch für "auszahlen"
    balance -= value;
  }

  public double getBalance() {
    return balance;
  }
}