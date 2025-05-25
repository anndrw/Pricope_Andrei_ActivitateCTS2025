package ro.cts.clase;

public class PlataCardBancar implements IMetodaPlata{
    private float sold;

    public PlataCardBancar(float sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.sold >= pretBilet){
            this.sold -= pretBilet;
            System.out.println("Plata cu cardul bancar validata! Sold ramas: " + this.sold + " RON" );
        } else {
            System.out.println("Sold insuficient!");
        }
    }
}
