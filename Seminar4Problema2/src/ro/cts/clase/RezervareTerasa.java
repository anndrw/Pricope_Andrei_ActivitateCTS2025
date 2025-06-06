package ro.cts.clase;

public class RezervareTerasa extends AbstractRezervare{
    private boolean esteFumator;

    public RezervareTerasa() {
        super();
    }

    public RezervareTerasa(float nrParticipanti, int ora, String numeClient, int ziuaLunii, boolean esteFumator) {
        super(nrParticipanti, ora, numeClient, ziuaLunii);
        this.esteFumator = esteFumator;
    }

    @Override
    public AbstractRezervare copiaza(int ziua) { // facem un setter practic direct aici
        RezervareTerasa rezervare = new RezervareTerasa();
        rezervare.ziuaLunii = ziua;
        rezervare.numeClient = this.numeClient;
        rezervare.ora = this.ora;
        rezervare.nrParticipanti = this.nrParticipanti;
        rezervare.esteFumator = this.esteFumator;

        return rezervare;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareTerasa{");
        sb.append("esteFumator=").append(esteFumator);
        sb.append(", nrParticipanti=").append(nrParticipanti);
        sb.append(", ora=").append(ora);
        sb.append(", numeClient='").append(numeClient).append('\'');
        sb.append(", ziuaLunii=").append(ziuaLunii);
        sb.append('}');
        return sb.toString();
    }
}
