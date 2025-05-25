package ro.cts.clase;

public class NotaDePlata implements Nota{
    private float totalPlata;

    public NotaDePlata(float totalPlata) {
        this.totalPlata = totalPlata;
    }

    @Override
    public void printeaza() {
        System.out.println("Aveti de plata suma de " + this.totalPlata);
    }
}
