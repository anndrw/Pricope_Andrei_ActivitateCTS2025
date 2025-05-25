package Facade2.src.ro.cts.main;


import Facade2.src.ro.cts.clase.Autobuz;
import Facade2.src.ro.cts.clase.Sofer;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(false, true);
        Sofer sofer = new Sofer();
        String mesaj = sofer.deschidereUsi(autobuz);
        System.out.println(mesaj);
    }
}