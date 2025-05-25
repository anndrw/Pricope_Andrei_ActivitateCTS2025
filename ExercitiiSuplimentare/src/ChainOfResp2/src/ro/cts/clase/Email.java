package ChainOfResp2.src.ro.cts.clase;

public class Email extends InfoClienti{

    @Override
    public void notificaClient(Client client) {
        if(client.getEmail() != null){
            System.out.println("Trimitere email cu notificare catre clientul " + client.getNume());
        } else {
            this.getNotificare().notificaClient(client);
        }

    }
}
