package Template2.src.ro.cts.clase;

public abstract class TemplateOcupareMasa {
    public final void ocupare(Masa masa){
        if(!curatareMasa(masa)){
            System.out.println("Masa trebuie curatata!");
        } else {
            //curatareMasa(masa);
            asezareServetele();
            asezareTacamuri();
            invitarePersoaneLaMasa();
        }
    }

    public abstract boolean curatareMasa(Masa masa);
    public abstract void asezareServetele();
    public abstract void asezareTacamuri();
    public abstract void invitarePersoaneLaMasa();
}
