package Adapter2.src.ro.cts.clase;

public class BiletTerestru {
    private double pret;

    public BiletTerestru(double pret) {
        this.pret = pret;
    }

    public void cumparaBilet(){
        System.out.println("Ai cumparat un bilet terestru la pretul de " + this.pret);
    }
}
