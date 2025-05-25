package Composite2.src.ro.cts.clase;

public class Autobuz implements Structura{
    private String producator;
    private String model;
    private int nrLocuri;

    public Autobuz(String producator, String model, int nrLocuri) {
        this.producator = producator;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception{
        throw new Exception("Nu a fost implementata!");
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception{
        throw new Exception("Nu a fost implementata!");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzul are " + this.nrLocuri + " locuri." + " Producatorul este " + this.producator + " si modelul este " + this.model + ".");
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        throw new Exception("Nu a fost implementata!");
    }
}
