package Template2.src.ro.cts.clase;

public class RestaurantAlocareMasa extends TemplateOcupareMasa{
    private String numeClient;

    public RestaurantAlocareMasa(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public boolean curatareMasa(Masa masa) {
        if(masa.getNrMasa() % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void asezareServetele() {
        System.out.println("Servetelele s-au pus.");
    }

    @Override
    public void asezareTacamuri() {
        System.out.println("Tacamurile s-au pus.");

    }

    @Override
    public void invitarePersoaneLaMasa() {
        System.out.println(this.numeClient + " poate lua loc la masa!");

    }
}
