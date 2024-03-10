package AccountApplicationSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AccountGui extends JFrame implements ActionListener{
	private JLabel balance = new JLabel("Balance"); // Ein Label
	private JLabel balanceValue = new JLabel("wert"); // Ein Label
	private JTextField amount = new JTextField(); // Ein Textfeld
	private JButton deposit = new JButton("deposit"); // Ein Button
	private JButton withdraw = new JButton("withdraw"); // Ein Button
	Account account = new Account();

	public void start() {
		setLayout(null); // Standard Layout deaktivieren
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Beim Fensterschliessen, alles beenden
		setSize(300, 300); // Grösse vom Fenster festlegen
		setTitle("Account"); // Titel des Fensters festlegen
		
		balance.setBounds(10, 20, 100, 20); // Bestimmen wo sich das Label befindet
		add(balance); // Label hinzufügen
		
		balanceValue.setBounds(120, 20, 100, 20); // Bestimmen wo sich das Label befindet
		add(balanceValue); // Label hinzufügen
		
		amount.setBounds(10, 60, 100, 20); // Bestimmen wo sich das Textfeld befindet
		add(amount); // Textfeld hinzufügen
		
		deposit.setBounds(10, 90, 100, 20); // Bestimmen wo sich der Button befindet
		deposit.addActionListener(this);
		add(deposit); // Textfeld hinzufügen
		
		withdraw.setBounds(10, 120, 100, 20); // Bestimmen wo sich der Button befindet
		withdraw.addActionListener(this);
		add(withdraw); // Textfeld hinzufügen
		
		setVisible(true); // Fenster sichtbar machen
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == deposit) {
			double parsed = Double.parseDouble(amount.getText());
			account.deposit(parsed);
			balanceValue.setText(account.getBalance() + "");
		}else if (e.getSource() == withdraw) {
			double parsed = Double.parseDouble(amount.getText());
			account.withdraw(parsed);
			balanceValue.setText(account.getBalance() + "");
		}

	}
}
