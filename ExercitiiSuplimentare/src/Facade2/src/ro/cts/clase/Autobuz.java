package Facade2.src.ro.cts.clase;

public class Autobuz {
    private boolean modLiber;
    private boolean modFortat;

    public Autobuz(boolean modLiber, boolean modFortat) {
        this.modLiber = modLiber;
        this.modFortat = modFortat;
    }

    public boolean isModLiber() {
        return modLiber;
    }

    public boolean isModFortat() {
        return modFortat;
    }
}
