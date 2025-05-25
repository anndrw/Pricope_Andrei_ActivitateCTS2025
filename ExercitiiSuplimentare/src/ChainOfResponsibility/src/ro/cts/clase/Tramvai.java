package ro.cts.clase;

public class Tramvai extends InfoTransport{

    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 8) {
            System.out.println("Iti recomand sa mergi cu tramvaiul.");
        }
    }
}
