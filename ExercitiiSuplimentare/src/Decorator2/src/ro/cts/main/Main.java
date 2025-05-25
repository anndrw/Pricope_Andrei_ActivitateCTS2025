package ro.cts.main;

import ro.cts.clase.Bautura;
import ro.cts.clase.Espresso;
import ro.cts.clase.LapteDecorator;

public class Main {
    public static void main(String[] args) {
        Bautura bautura = new Espresso();
        bautura = new LapteDecorator(bautura);

        System.out.println("Comanda: " + bautura.getDescriere());
        System.out.println("Pret total: " + bautura.getPret() + " RON");
    }
}