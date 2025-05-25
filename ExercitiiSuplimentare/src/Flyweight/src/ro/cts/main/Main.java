package ro.cts.main;

import ro.cts.clase.FabricaPacienti;
import ro.cts.clase.PacientAbstract;
import ro.cts.clase.Spitalizare;

public class Main {
    public static void main(String[] args) {

        FabricaPacienti fabrica = new FabricaPacienti();

        PacientAbstract pacient = fabrica.getPacient("Andrei", "0729092712", "email@pacient1.ro");
        Spitalizare spitalizare = new Spitalizare(5, 8, 10);

        pacient.afiseazaPacient(spitalizare);

        Spitalizare spitalizare2 = new Spitalizare(6, 7, 8);
        Spitalizare spitalizare3 = new Spitalizare(7, 9, 11);

        fabrica.getPacient("Andreea", "07129213124", "andreea@pacient2.ro").afiseazaPacient(spitalizare2);

        try{
            fabrica.getPacient("07129213124").afiseazaPacient(spitalizare3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}