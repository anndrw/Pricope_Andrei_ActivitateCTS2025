package Decorator2.src.ro.cts.clase;

public abstract class IngredienteDecorator implements Bautura{
    protected Bautura bautura;

    public IngredienteDecorator(Bautura bautura) {
        this.bautura = bautura;
    }

    public abstract String getDescriere();
    public abstract double getPret();
}
