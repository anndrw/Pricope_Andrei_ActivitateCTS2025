package Adapter3.src.ro.cts.clase;

public class SoftBar {
    private String numeBautura;
    private double pretBautura;

    public SoftBar(String numeBautura, double pretBautura) {
        this.numeBautura = numeBautura;
        this.pretBautura = pretBautura;
    }

    public String getNumeBautura() {
        return numeBautura;
    }

    public double getPretBautura() {
        return pretBautura;
    }

    public void cumparaBautura(){
        System.out.println("Ai cumparat bautura " + this.numeBautura + " la pretul de " + this.pretBautura);
    }
}
