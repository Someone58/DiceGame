import javax.swing.JFrame;
import javax.swing.JLabel;

public class PureWindow extends JFrame {

  public void showDialog() { // Beliebiger Name, kann auch, "start" oder nur "show" heissen.
    setLayout(null); // Deaktiviert Layout-Automatismen von Swing
    setDefaultCloseOperation(EXIT_ON_CLOSE); // Beended beim Schliessen des Fensters ebenfalls den Prozess
    setSize(300, 300); // Bestimmt die grösse des Fensters
    setTitle("Mein toller Titel"); // Setzt den Titel des Fensters
    setVisible(true); // Muss am Ende stehen! Ohne das wird nichts angezeigt!
    
    JLabel label = new JLabel("Beschriftung");
    add(label);

 // Wichtige Methoden
 label.setBounds(50, 50, 10, 100); // setzt die Koordinaten der Komponente auf dem Fenster
 label.setText("Eine neue Beschriftung"); // Setzt einen neuen Text
 String text = "text"; // gibt den Text des Labels zurück
  }

  
}

