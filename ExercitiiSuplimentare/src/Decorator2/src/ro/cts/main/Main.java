package Decorator2.src.ro.cts.main;


import Decorator2.src.ro.cts.clase.Bautura;
import Decorator2.src.ro.cts.clase.Espresso;
import Decorator2.src.ro.cts.clase.LapteDecorator;

public class Main {
    public static void main(String[] args) {
        Bautura bautura = new Espresso();
        bautura = new LapteDecorator(bautura);

        System.out.println("Comanda: " + bautura.getDescriere());
        System.out.println("Pret total: " + bautura.getPret() + " RON");
    }
}