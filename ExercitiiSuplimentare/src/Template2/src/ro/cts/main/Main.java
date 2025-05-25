package ro.cts.main;

import ro.cts.clase.Masa;
import ro.cts.clase.RestaurantAlocareMasa;
import ro.cts.clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2);
        TemplateOcupareMasa ocupareMasa = new RestaurantAlocareMasa("Andrei");
        ocupareMasa.ocupare(masa);
    }
}