package ro.cts.main;

import ro.cts.clase.Nota;
import ro.cts.clase.NotaDePlata;
import ro.cts.clase.NotaDePlataCraciun;
import ro.cts.clase.NotaDePlataRevelion;

public class Main {
    public static void main(String[] args){
        Nota nota = new NotaDePlata(399.9f);
        nota.printeaza();

        Nota notaDePlataCraciun = new NotaDePlataCraciun(nota);
        notaDePlataCraciun.printeaza();

        Nota notaDePlataRevelion = new NotaDePlataRevelion(nota);
        notaDePlataRevelion.printeaza();
    }
}
