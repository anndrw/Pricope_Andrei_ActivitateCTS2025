package ro.cts.clase;

import java.util.HashMap;

public class FabricaAutobuz {
    private HashMap<String, IAutobuz> colectieAutobuze;

    public FabricaAutobuz() {
        this.colectieAutobuze = new HashMap<>();
    }

    public IAutobuz getAutobuz(String model) throws Exception{
        IAutobuz autobuz = colectieAutobuze.get(model);
        if(autobuz == null){
            throw new Exception();
        }
        return autobuz;
    }

    public IAutobuz getAutobuz(String model, int anFabricatie, int nrLocuri){
        IAutobuz autobuz = colectieAutobuze.get(model);
        if(autobuz == null){
            autobuz = new Autobuz(model, anFabricatie, nrLocuri);
            colectieAutobuze.put(model, autobuz);
        }
        return autobuz;
    }
}
