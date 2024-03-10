public class Starter {

    public static void main(String[] args) { // Startpunkt des Programms, ist immer static!
        AccountApplicationMusterloesung app = new AccountApplicationMusterloesung(); // `new` ist innerhalb von `static` erlaubt
        app.start(); // starten der eigentlichen App
    }

}