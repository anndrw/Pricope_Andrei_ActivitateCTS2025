package ro.cts.clase;

public class Manager extends InfoClienti{

    @Override
    public void notificaClient(Client client) {
        System.out.println("Clientul " + client.getNume() + " nu are date de contact. Se notifica managerul.");
    }
}
