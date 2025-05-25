package ro.cts.clase;

public class AdapterSoft extends SoftBar{
    private SoftBucatarie softBucatarie;

    public AdapterSoft(SoftBucatarie softBucatarie){
        super(softBucatarie.getNumeMancare(), softBucatarie.getPret());
        this.softBucatarie = softBucatarie;
    }

    @Override
    public void cumparaBautura() {
        softBucatarie.cumparaMancare();
    }
}
