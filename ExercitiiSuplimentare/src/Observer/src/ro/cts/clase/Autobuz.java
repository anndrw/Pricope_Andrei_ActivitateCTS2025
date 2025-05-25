package ro.cts.clase;

import java.util.List;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarLinie) {
        super(numarLinie);
    }

    @Override
    public void pleacaDeLaCapat() {
        trimiteMesaj("Autobuzul numarul " + this.getNumarLinie() + " pleaca de la capatul liniei!");
    }

    public void schimbaTraseul() {
        trimiteMesaj("Autobuzul numarul " + this.getNumarLinie() + " va schimba traseul.");
    }
}
