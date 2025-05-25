package ro.cts.clase;

public class MedicamentFarmacie {
    private String nume;
    private float pret;
    private String dataExpirare;

    public MedicamentFarmacie(String nume, float pret, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament(){
        System.out.println("Medicamentul " + this.nume + " expira la data de " + this.dataExpirare + " si are pretul de " + this.pret);
    }
}
