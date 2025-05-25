package Template2.src.ro.cts.main;


import Template2.src.ro.cts.clase.Masa;
import Template2.src.ro.cts.clase.RestaurantAlocareMasa;
import Template2.src.ro.cts.clase.TemplateOcupareMasa;

public class Main {
    public static void main(String[] args) {
        Masa masa = new Masa(2);
        TemplateOcupareMasa ocupareMasa = new RestaurantAlocareMasa("Andrei");
        ocupareMasa.ocupare(masa);
    }
}