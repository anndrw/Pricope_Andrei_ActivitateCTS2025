package ro.cts.main;

import ro.cts.clase.Pacient;
import ro.cts.clase.SpitalPrivat;
import ro.cts.clase.SpitalPublic;
import ro.cts.clase.TemplateInternare;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Andrei", 4);
        TemplateInternare spitalPublic = new SpitalPublic("SpitalPublic");
        spitalPublic.internare(pacient);

        TemplateInternare spitalPrivat = new SpitalPrivat("SpitalPrivat");
        spitalPrivat.internare(pacient);

    }
}