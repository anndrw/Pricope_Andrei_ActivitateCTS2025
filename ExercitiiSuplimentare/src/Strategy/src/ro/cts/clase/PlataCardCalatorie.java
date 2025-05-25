package ro.cts.clase;

public class PlataCardCalatorie implements IMetodaPlata{
    private int nrCalatorii;

    public PlataCardCalatorie(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(float pretBilet) {
        if(this.nrCalatorii > 0){
            this.nrCalatorii--;
            System.out.println("Plata cu cardul de calatorii validata! " + this.nrCalatorii + " calatorii ramase.");
        } else {
            System.out.println("Nu mai aveti calatorii ramase pe card.");
        }
    }
}
