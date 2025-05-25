package ro.cts.main;

import ro.cts.clase.Autobuz;
import ro.cts.clase.InfoTransport;
import ro.cts.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        InfoTransport autobuz = new Autobuz();
        InfoTransport tramvai = new Tramvai();

        autobuz.setUnMijloc(tramvai);
        tramvai.setUnMijloc(null);

        autobuz.recomandaMijloc(3);
        autobuz.recomandaMijloc(7);
    }
}