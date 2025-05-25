package Observer2.src.ro.cts.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Salut, " + this.nume + ", ai primit o notificare!" + mesaj);
    }
}
