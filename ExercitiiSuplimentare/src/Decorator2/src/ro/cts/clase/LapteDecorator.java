package Decorator2.src.ro.cts.clase;

public class LapteDecorator extends IngredienteDecorator{

    public LapteDecorator(Bautura bautura) {
        super(bautura);
    }

    @Override
    public String getDescriere() {
        return bautura.getDescriere() +  " cu lapte";
    }

    @Override
    public double getPret() {
        return bautura.getPret() + 2.0;
    }
}
