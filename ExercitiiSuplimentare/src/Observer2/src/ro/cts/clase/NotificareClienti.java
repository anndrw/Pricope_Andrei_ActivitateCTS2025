package Observer2.src.ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class NotificareClienti implements Subject{
    private int nrClienti;
    private List<Observer> clienti;

    public NotificareClienti(int nrClienti) {
        this.nrClienti = nrClienti;
        this.clienti = new ArrayList<Observer>();
    }

    public int getNrClienti() {
        return nrClienti;
    }

    public List<Observer> getClienti() {
        return clienti;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        clienti.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        clienti.remove(observer);
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(Observer observer : clienti){
            observer.primesteMesaj(mesaj);
        }
    }

    public abstract void multumeste();
}
