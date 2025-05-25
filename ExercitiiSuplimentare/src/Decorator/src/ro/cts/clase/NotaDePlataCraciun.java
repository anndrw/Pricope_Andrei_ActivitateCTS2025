package ro.cts.clase;

public class NotaDePlataCraciun extends PrinterFelicitare{

    public NotaDePlataCraciun(Nota notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printareFelicitare() {
        System.out.println("Craciun Fericit!");
    }
}
