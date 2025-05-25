package ro.cts.clase;

public class AdaptorObiecte extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdaptorObiecte(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNume(), medicamentSpital.getPret(), "25.01.2028");
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
