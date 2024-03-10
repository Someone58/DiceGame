import mytools.StdInput;

public class AccountApplication {
	public static void main(String[] args) {

		double amount;
		double balance = 0;
		char decision;
		boolean stop = false;

		System.out.println("Welcome to the account application");

		do {
			amount = StdInput.readDouble("Please enter the amount, 0 (zero) to terminate");

			if (amount == 0) {
				stop = true;
			}

			else {

				decision = StdInput.readChar("To deposit, press +, to withdraw, press -");

				if (decision == '+') {
					balance = deposite(balance, amount);
				}

				else if (decision == '-') {
					balance = withdraw(balance, amount);
				}

				else if (decision == '=') {
					System.out.println("Final balance: " + balance);
				}
			}
		} while (stop == false);

		System.out.println("Final balance: " + balance);
	}

	public static double deposite(double number, double plus) {
		return number + plus;
	}

	public static double withdraw(double number, double plus) {
		return number - plus;
	}
}
