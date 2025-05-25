package Adapter3.src.ro.cts.main;


import Adapter3.src.ro.cts.clase.AdapterSoft;
import Adapter3.src.ro.cts.clase.SoftBar;
import Adapter3.src.ro.cts.clase.SoftBucatarie;

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