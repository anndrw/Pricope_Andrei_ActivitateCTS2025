package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String, PacientAbstract> colectiePacienti;

    public FabricaPacienti() {
        this.colectiePacienti = new HashMap<>();
    }

    public PacientAbstract getPacient(String nrTelefon) throws Exception{
        PacientAbstract pacientAbstract = colectiePacienti.get(nrTelefon);
        if(pacientAbstract == null){
            throw new Exception();
        }
        return pacientAbstract;
    }

    public PacientAbstract getPacient(String nume, String nrTelefon, String email){
        PacientAbstract pacientAbstract = colectiePacienti.get(nrTelefon);
        if(pacientAbstract == null){
            pacientAbstract = new Pacient(nume, nrTelefon, email);
            colectiePacienti.put(nrTelefon, pacientAbstract);
        }
        return pacientAbstract;
    }
}
