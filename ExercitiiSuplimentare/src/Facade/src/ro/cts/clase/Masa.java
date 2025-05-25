package ro.cts.clase;

public class Masa {
    private boolean eLibera;
    private int nrMasa;
    private int nrPersoane;

    public Masa(boolean eLibera, int nrMasa, int nrPersoane) {
        this.eLibera = eLibera;
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
    }

    public boolean iseLibera() {
        return eLibera;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
