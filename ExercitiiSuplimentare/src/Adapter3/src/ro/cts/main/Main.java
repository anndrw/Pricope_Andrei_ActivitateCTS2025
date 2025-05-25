package ro.cts.main;

import ro.cts.clase.AdapterSoft;
import ro.cts.clase.SoftBar;
import ro.cts.clase.SoftBucatarie;

public class Main {
    public static void vindeObiect(SoftBar softBar){
        System.out.println("Bar >>>>");
        softBar.cumparaBautura();
    }
    public static void main(String[] args) {
        SoftBar softBar = new SoftBar("Espresso", 7.0);
        vindeObiect(softBar);

        SoftBucatarie softBucatarie = new SoftBucatarie("Paste", 29.99);
        AdapterSoft adapterSoft = new AdapterSoft(softBucatarie);
        vindeObiect(adapterSoft);
    }
}