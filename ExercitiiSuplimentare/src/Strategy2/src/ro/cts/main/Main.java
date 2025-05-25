package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.IOpresteStatie;
import ro.cts.clase.OprireCuCalatori;
import ro.cts.clase.OprireFaraCalatori;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(new OprireCuCalatori());
        autobuz.executaOprire(1);

        autobuz.setOpresteStatie(new OprireFaraCalatori());
        autobuz.executaOprire(0);
    }
}