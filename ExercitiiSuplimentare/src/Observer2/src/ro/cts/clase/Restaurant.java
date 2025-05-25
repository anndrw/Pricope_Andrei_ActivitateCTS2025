package Observer2.src.ro.cts.clase;

public class Restaurant extends NotificareClienti{

    public Restaurant(int nrClienti) {
        super(nrClienti);
    }

    @Override
    public void multumeste() {
        trimiteMesaj(" Multumim la toti cei " + this.getNrClienti() + " fideli! Aveti 10% reducere la tot meniul.");
    }
}
