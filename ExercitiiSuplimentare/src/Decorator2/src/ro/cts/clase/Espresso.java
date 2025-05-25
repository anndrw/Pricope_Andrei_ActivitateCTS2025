package ro.cts.clase;

public class Espresso implements Bautura{

    @Override
    public String getDescriere() {
        return "Bautura se cheama Espresso. Are 40ml.";
    }

    @Override
    public double getPret() {
        return 7.0;
    }
}
