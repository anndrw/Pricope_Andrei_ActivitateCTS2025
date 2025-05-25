package ro.cts.main;

import ro.cts.clase.AdapterBilete;
import ro.cts.clase.BiletSubteran;
import ro.cts.clase.BiletTerestru;

public class Main {
    public static void vindeBilet(BiletTerestru biletTerestru){
        System.out.println("STB >>>> ");
        biletTerestru.cumparaBilet();
    }
    public static void main(String[] args) {
        BiletTerestru biletTerestru = new BiletTerestru(10.99);
        vindeBilet(biletTerestru);

        BiletSubteran biletSubteran = new BiletSubteran(11.99);
        AdapterBilete adapterBilete = new AdapterBilete(biletSubteran);
        vindeBilet(adapterBilete);
    }
}