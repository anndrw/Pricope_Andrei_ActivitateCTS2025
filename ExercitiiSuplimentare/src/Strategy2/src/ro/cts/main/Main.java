package Strategy2.src.ro.cts.main;


import Strategy2.src.ro.cts.clase.Autobuz;
import Strategy2.src.ro.cts.clase.OprireCuCalatori;
import Strategy2.src.ro.cts.clase.OprireFaraCalatori;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(new OprireCuCalatori());
        autobuz.executaOprire(1);

        autobuz.setOpresteStatie(new OprireFaraCalatori());
        autobuz.executaOprire(0);
    }
}