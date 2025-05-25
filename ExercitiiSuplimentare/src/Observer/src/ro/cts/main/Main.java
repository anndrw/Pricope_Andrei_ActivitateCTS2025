package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.Calator;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args) {
        Observer calator1 = new Calator("Andrei");
        Observer calator2 = new Calator("George");
        Observer calator3 = new Calator("Matei");

        MijlocTransport autobuz = new Autobuz(20);

        autobuz.adaugaObserver(calator1);
        autobuz.pleacaDeLaCapat();

        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();

        autobuz.stergeObserver(calator2);

        autobuz.pleacaDeLaCapat();
        ((Autobuz)autobuz).schimbaTraseul();
    }
}