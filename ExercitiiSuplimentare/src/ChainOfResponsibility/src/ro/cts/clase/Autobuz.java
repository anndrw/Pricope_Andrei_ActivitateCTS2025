package ro.cts.clase;

public class Autobuz extends InfoTransport{
    @Override
    public void recomandaMijloc(int distanta) {
        if(distanta < 5){
            System.out.println("Iti recomand sa mergi cu autobuzul.");
        } else {
            this.getUnMijloc().recomandaMijloc(distanta);
        }
    }
}
