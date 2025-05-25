package ro.cts.clase;

public class Sofer {
    public String deschidereUsi(Autobuz autobuz){
        ButonUsiFortate buton1 = new ButonUsiFortate();
        ButonUsiLibere buton2 = new ButonUsiLibere();

        if(autobuz.isModFortat()){
            if(buton1.modFortat(autobuz)){
                return "Usile se deschid acum fortat!" + autobuz.isModFortat();
            } else {
                return "Usile nu se deschid acum fortat.";
            }
        } else if(autobuz.isModLiber()){
            if(buton2.suntLibere(autobuz)){
                return "Usile se deschid acum la liber." + autobuz.isModLiber();
            } else {
                return "Usile se deschid acum fortat.";
            }
        } else {
            return "Mod necunoscut.";
        }

    }
}
