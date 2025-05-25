package Observer2.src.ro.cts.main;


import Observer2.src.ro.cts.clase.Client;
import Observer2.src.ro.cts.clase.NotificareClienti;
import Observer2.src.ro.cts.clase.Observer;
import Observer2.src.ro.cts.clase.Restaurant;

public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("Andrei");
        Observer client2 = new Client("Matei");

        NotificareClienti notificareClienti = new Restaurant(5);
        notificareClienti.adaugaObserver(client1);
        notificareClienti.adaugaObserver(client2);

        notificareClienti.multumeste();
    }
}