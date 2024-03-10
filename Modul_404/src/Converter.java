import java.util.Scanner;

public class Converter {
  public void dialog() {
    double convtemp;
    // Geht es ohne `new`, rsp. ohne Objekt `converter`?
    DegreesConverter converter = new DegreesConverter();
    int userEntry = 0;
    try(Scanner scanner = new Scanner(System.in)) {
      do {
        System.out.println("Möchten Sie (1) Fahrenheit nach Celsius oder (2) Celsius nach Fahrenheit umrechnen?");
        System.out.print("Bitte geben Sie Ihre Wahl 1 oder 2 ein: ");
        userEntry = scanner.nextInt();
        System.out.print("Bitte geben Sie die Temperatur ein: ");
        double temp = scanner.nextDouble();
        if (userEntry == 1) {
          // Was muss hier geändert werden wenn es kein Objekt `converter` mehr gibt?
          convtemp = converter.toCelsius(temp);
        } else {
          // Was muss hier geändert werden wenn es kein Objekt `converter` mehr gibt?
          convtemp = converter.toFahrenheit(temp);
        }
        System.out.println("Die umgerechnete Temperatur beträgt: " + convtemp);
        System.out.print("Möchten Sie noch eine Temperatur umrechnen? Dann 1 eingeben. ");
        userEntry = scanner.nextInt();
      } while (userEntry == 1);
    }
  }
}