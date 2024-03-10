package AccountApplicationSwing;

public class Account {
	private double balance = 0;

	public double getBalance() {
		return balance;
	}

	public double deposit(double amount) {
		return balance += amount;
	}

	public double withdraw(double amount) {
		return balance -= amount;
	}
}
