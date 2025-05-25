package Composite2.src.ro.cts.main;


import Composite2.src.ro.cts.clase.Autobuz;
import Composite2.src.ro.cts.clase.Grupuri;

public class Main {
    public static void main(String[] args) {
        Grupuri autobuzeMici = new Grupuri("Autobuze Mici");
        Grupuri autobuzeMedii = new Grupuri("Autobuze Medii");
        Grupuri autobuzeMari = new Grupuri("Autobuze Mari");

        Autobuz autobuzMic = new Autobuz("Scania", "ModelX", 10);
        Autobuz autobuzMediu = new Autobuz("Volvo", "ModelY", 30);
        Autobuz autobuzMare = new Autobuz("Ford", "ModelZ", 50);

        try{
            autobuzeMici.adaugaStructura(autobuzMic);
            autobuzeMedii.adaugaStructura(autobuzMediu);
            autobuzeMari.adaugaStructura(autobuzMare);

            autobuzeMari.afiseazaDescriere();
            autobuzeMici.afiseazaDescriere();
            autobuzeMedii.afiseazaDescriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}