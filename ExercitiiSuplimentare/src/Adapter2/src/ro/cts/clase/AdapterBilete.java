package ro.cts.clase;

public class AdapterBilete extends BiletTerestru{
    private BiletSubteran biletSubteran;

    public AdapterBilete(BiletSubteran biletSubteran) {
        super(biletSubteran.getPret());
        this.biletSubteran = biletSubteran;
    }

    @Override
    public void cumparaBilet() {
        biletSubteran.achizitioneazaBilet();
    }
}
