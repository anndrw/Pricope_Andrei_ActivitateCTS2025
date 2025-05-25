package ro.cts.clase;

public class MedicamentSpital {
    private String nume;
    private float pret;

    public MedicamentSpital(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        prezintaReteta();
        System.out.println("Ati achizitionat medicamentul " + this.nume + " la pretul de " + this.pret);
    }

    public void prezintaReteta(){
        System.out.println("Se prezinta reteta pentru medicamentul " + this.nume);
    }
}
