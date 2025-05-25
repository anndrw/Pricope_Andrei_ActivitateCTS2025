package ro.cts.clase;

public class Parmezan extends PrinterMancare{

    public Parmezan(Mancare mancare) {
        super(mancare);
    }

    @Override
    public void printeazaMesaj() {
        System.out.println("Am adaugat parmezan!");
    }
}
