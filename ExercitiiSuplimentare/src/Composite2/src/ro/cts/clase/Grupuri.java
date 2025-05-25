package ro.cts.clase;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Grupuri implements Structura{
    private String denumire;
    private List<Structura> lista;

    public Grupuri(String denumire) {
        this.denumire = denumire;
        this.lista = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(Structura structura) throws Exception {
        lista.add(structura);
    }

    @Override
    public void stergeStructura(Structura structura) throws Exception {
        lista.remove(structura);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Grupul " + this.denumire + " contine urmatoarele autobuze: ");
        for(Structura s : lista){
            s.afiseazaDescriere();
        }
    }

    @Override
    public Structura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
