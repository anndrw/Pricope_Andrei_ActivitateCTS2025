package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        IMetodaPlata cardCalatorie = new PlataCardCalatorie(2);
        IMetodaPlata plataSMS = new PlataSMS();

        Calator calator = new Calator("Andrei");

        calator.platesteCalatorie(3);

        calator.setMetodaPlata(cardCalatorie);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);
        calator.platesteCalatorie(3);

        calator.setMetodaPlata(plataSMS);
        calator.platesteCalatorie(3);

        // var 2
        PlataCardBancar plataCardBancar = new PlataCardBancar(5);
        Calator calator1 = new Calator("Maria", plataCardBancar);
        calator1.platesteCalatorie(3);
    }
}