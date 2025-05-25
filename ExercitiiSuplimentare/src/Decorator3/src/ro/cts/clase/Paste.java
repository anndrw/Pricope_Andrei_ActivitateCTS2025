package Decorator3.src.ro.cts.clase;

public class Paste implements Mancare{
    private double pret;

    public Paste(double pret) {
        this.pret = pret;
    }

    @Override
    public void printeaza() {
        System.out.println("Pastele au pretul de " + this.pret);

    }
}
