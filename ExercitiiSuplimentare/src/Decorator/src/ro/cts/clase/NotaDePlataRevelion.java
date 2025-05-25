package ro.cts.clase;

public class NotaDePlataRevelion extends PrinterFelicitare{


    public NotaDePlataRevelion(Nota notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printareFelicitare() {
        System.out.println("La multi ani!");
    }
}
