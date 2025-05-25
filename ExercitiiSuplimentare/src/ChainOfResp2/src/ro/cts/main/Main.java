package ChainOfResp2.src.ro.cts.main;


import ChainOfResp2.src.ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Andrei", "0721231213", "email@persoana1.ro");
        Client client1 = new Client("Matei", null, "email@persoana1.ro");
        Client client2 = new Client("George", "827613816", null);
        Client client3 = new Client("Maria", null, null);

        InfoClienti sms = new SMS();
        InfoClienti email = new Email();
        InfoClienti manager = new Manager();

        sms.setNotificare(email);
        email.setNotificare(manager);
        manager.setNotificare(null);

        sms.notificaClient(client);
        sms.notificaClient(client1);
        sms.notificaClient(client2);
        sms.notificaClient(client3);
    }
}