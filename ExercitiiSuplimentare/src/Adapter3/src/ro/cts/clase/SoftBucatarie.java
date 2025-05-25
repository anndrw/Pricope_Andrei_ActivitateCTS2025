package ro.cts.clase;

public class SoftBucatarie {
    private String numeMancare;
    private double pret;

    public SoftBucatarie(String numeMancare, double pret) {
        this.numeMancare = numeMancare;
        this.pret = pret;
    }

    public String getNumeMancare() {
        return numeMancare;
    }

    public double getPret() {
        return pret;
    }

    public void cumparaMancare(){
        System.out.println("Ati cumparat mancarea " + this.numeMancare + " la pretul de " + this.pret);
    }
}
