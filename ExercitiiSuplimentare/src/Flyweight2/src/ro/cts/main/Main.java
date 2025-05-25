package ro.cts.main;

import ro.cts.clase.AutobuzLinie;
import ro.cts.clase.FabricaAutobuz;
import ro.cts.clase.IAutobuz;

public class Main {
    public static void main(String[] args) {
        FabricaAutobuz fabricaAutobuz = new FabricaAutobuz();

        IAutobuz autobuz = fabricaAutobuz.getAutobuz("Scania", 2020, 32);
        AutobuzLinie autobuzLinie = new AutobuzLinie("20", "Piata Romana", "Piata Victoriei");

        autobuz.afiseazaAutobuz(autobuzLinie);

        AutobuzLinie autobuzLinie1 = new AutobuzLinie("25", "Tineretului", "Piata Romana");
        fabricaAutobuz.getAutobuz("Volvo", 2019, 18).afiseazaAutobuz(autobuzLinie1);

        try{
            fabricaAutobuz.getAutobuz("Volvo").afiseazaAutobuz(autobuzLinie);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}