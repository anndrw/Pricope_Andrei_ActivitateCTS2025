package ro.cts.clase;

public abstract class PrinterFelicitare implements Nota {
    private Nota notaPlata;

    public PrinterFelicitare(Nota notaPlata) {
        this.notaPlata = notaPlata;
    }

    @Override
    public void printeaza() {
        notaPlata.printeaza();
        printareFelicitare();
    }

    public abstract void printareFelicitare();
}
