package Facade2.src.ro.cts.clase;

public class ButonUsiLibere {
    public boolean suntLibere(Autobuz autobuz){
        return autobuz.isModLiber() == true;
    }
}
