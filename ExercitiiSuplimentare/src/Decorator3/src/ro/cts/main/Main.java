package ro.cts.main;

import ro.cts.clase.Mancare;
import ro.cts.clase.Parmezan;
import ro.cts.clase.Paste;
import ro.cts.clase.PrinterMancare;

public class Main {
    public static void main(String[] args) {
        Mancare paste = new Paste(32.99);
        paste.printeaza();

        Mancare pasteParmezan = new Parmezan(paste);
        pasteParmezan.printeaza();
    }
}