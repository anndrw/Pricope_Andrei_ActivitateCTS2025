package Strategy2.src.ro.cts.clase;

public class OprireCuCalatori implements IOpresteStatie{

    @Override
    public void opresteInStatie(int nrCalatori) {
        if(nrCalatori > 0){
            System.out.println("Autobuzul opreste in statie.");
        } else {
            System.out.println("Autobuzul merge catre autobaza.");
        }
    }
}
