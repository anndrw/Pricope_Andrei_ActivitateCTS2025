package Composite.src.ro.cts.main;


import Composite.src.ro.cts.clase.Departament;
import Composite.src.ro.cts.clase.Sectie;

public class Main {
    public static void main(String[] args){
        Departament general = new Departament("General", 50);
        Departament pompieri = new Departament("Pompieri", 10);
        Departament politie = new Departament("Politie", 40);

        Sectie sectia1 = new Sectie("Sectia Locala");
        Sectie sectia2 = new Sectie("Sectia Judeteana");
        Sectie sectia3 = new Sectie("Sectia Principala Pompieri");

        try{
            general.adaugaStructura(politie);
            general.adaugaStructura(pompieri);

            politie.adaugaStructura(sectia1);
            politie.adaugaStructura(sectia2);
            pompieri.adaugaStructura(sectia3);

            general.afiseazaDescriere();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
