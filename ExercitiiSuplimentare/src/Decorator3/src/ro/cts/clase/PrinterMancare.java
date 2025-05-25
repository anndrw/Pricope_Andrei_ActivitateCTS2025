package Decorator3.src.ro.cts.clase;

public abstract class PrinterMancare implements Mancare{
    private Mancare mancare;

    public PrinterMancare(Mancare mancare) {
        this.mancare = mancare;
    }

    @Override
    public void printeaza() {
        mancare.printeaza();
        printeazaMesaj();
    }

    public abstract void printeazaMesaj();
}
