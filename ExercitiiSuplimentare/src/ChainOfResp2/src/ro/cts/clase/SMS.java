package ro.cts.clase;

public class SMS extends InfoClienti{

    @Override
    public void notificaClient(Client client) {
        if(client.getNrTelefon() != null){
            System.out.println("Trimitere notificare prin SMS la clientul " + client.getNume());
        } else {
            this.getNotificare().notificaClient(client);
        }
    }
}
