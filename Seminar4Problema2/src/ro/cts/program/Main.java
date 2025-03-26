package ro.cts.program;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[] args) {
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12, 15, "Popica", 12, true);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa.copiaza(35);
        AbstractRezervare rezervareTerasa3 = rezervareTerasa2.copiaza(25);

        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa2.toString());
        System.out.println(rezervareTerasa3.toString());

        //rezervareTerasa2.setZiuaLunii(20);
        System.out.println(rezervareTerasa2.toString());
    }
}