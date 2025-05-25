package ChainOfResp2.src.ro.cts.clase;

public abstract class InfoClienti {
    private InfoClienti notificare;

    public InfoClienti getNotificare() {
        return notificare;
    }

    public void setNotificare(InfoClienti notificare) {
        this.notificare = notificare;
    }

    public abstract void notificaClient(Client client);
}
