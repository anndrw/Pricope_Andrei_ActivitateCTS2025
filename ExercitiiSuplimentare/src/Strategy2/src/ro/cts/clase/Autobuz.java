package Strategy2.src.ro.cts.clase;

public class Autobuz {
    private IOpresteStatie opresteStatie;

    public Autobuz(IOpresteStatie opresteStatie) {
        this.opresteStatie = opresteStatie;
    }

    public void setOpresteStatie(IOpresteStatie opresteStatie) {
        this.opresteStatie = opresteStatie;
    }

    public void executaOprire(int nrCalatori){
        opresteStatie.opresteInStatie(nrCalatori);
    }
}
