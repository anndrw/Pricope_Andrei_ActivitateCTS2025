package ro.cts.main;

import ro.cts.clase.AdaptorObiecte;
import ro.cts.clase.MedicamentFarmacie;
import ro.cts.clase.MedicamentSpital;

public class Main {
    public static void vindeMedicament(MedicamentFarmacie medicamentFarmacie){
        System.out.println("Bine ati venit la farmacie!");
        System.out.println("-------");
        medicamentFarmacie.cumparaMedicament();
    }
    public static void main(String[] args){
        MedicamentFarmacie medicamentFarmacie = new MedicamentFarmacie("Paracetamol", 21.99f, "28.02.2029");
        vindeMedicament(medicamentFarmacie);
        MedicamentSpital medicamentSpital = new MedicamentSpital("Xanax", 39.99f);
        AdaptorObiecte adaptorObiecte = new AdaptorObiecte(medicamentSpital);
        vindeMedicament(adaptorObiecte);
    }
}
