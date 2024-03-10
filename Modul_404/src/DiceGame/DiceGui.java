package DiceGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DiceGui extends JFrame implements ActionListener{
	GamePlayer player1 = new GamePlayer();
	GamePlayer player2 = new GamePlayer();
	
	private JLabel punkte = new JLabel("Player 1: " + player1 + "Player 2" + player2);
	private JLabel rollpoints = new JLabel(Integer.toString(GamePlayer.rollTheDice(1)));
	private JButton roll1 = new JButton("Spieler 1 Würfeln");
	private JButton roll2 = new JButton("Spieler 2 Würfeln");
	
void start() {
	setLayout(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setSize(500, 300);
	setTitle("DiceGame");
	setVisible(true);
	
	punkte.setBounds(10, 20, 400, 30);
	add(punkte);
	
	rollpoints.setBounds(120, 20, 100, 20);
	add(rollpoints);
	
	roll1.setBounds(10, 60, 200, 20);
	roll1.addActionListener(this);
	add(roll1);
	
	roll2.setBounds(10, 90, 200, 20);
	roll2.addActionListener(this);
	add(roll2);
	
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == roll1) {
			player1.rollTheDice(1);
			punkte.setText(Integer.toString(player1 b.getPoints()));
		}
		
	}
	
	
}
