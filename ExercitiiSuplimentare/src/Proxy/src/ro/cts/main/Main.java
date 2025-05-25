package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Andrei", 8, 20);

        IRezervare proxy = new ProxyNumarPersoane(rezervare);
        proxy.rezerva("Andrei", 3, 15);

        IRezervare proxy2 = new ProxyOra(rezervare);
        proxy2.rezerva("Andrei", 6, 15);
    }
}
