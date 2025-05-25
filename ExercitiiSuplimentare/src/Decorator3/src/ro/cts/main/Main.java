package Decorator3.src.ro.cts.main;


import Decorator3.src.ro.cts.clase.Mancare;
import Decorator3.src.ro.cts.clase.Parmezan;
import Decorator3.src.ro.cts.clase.Paste;

public class Main {
    public static void main(String[] args) {
        Mancare paste = new Paste(32.99);
        paste.printeaza();

        Mancare pasteParmezan = new Parmezan(paste);
        pasteParmezan.printeaza();
    }
}