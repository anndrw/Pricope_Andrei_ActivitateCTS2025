package ro.cts.clase;

public class BiletSubteran {
    private double pret;

    public BiletSubteran(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public void achizitioneazaBilet(){
        System.out.println("Biletul subteran a fost cumparat la pretul de " + this.pret);
        prezintaBilet();
    }

    public void prezintaBilet(){
        System.out.println("Bilet scanat!");
    }
}
