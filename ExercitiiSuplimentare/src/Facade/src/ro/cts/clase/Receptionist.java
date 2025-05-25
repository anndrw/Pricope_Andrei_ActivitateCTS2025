package ro.cts.clase;

public class Receptionist {

    public String poateLuaLocLaMasa(Masa masa1){
        Ospatar ospatar = new Ospatar();
        Picolo picolo = new Picolo();

        if(masa1.iseLibera()){
          if(picolo.eDebarasataMasa(masa1)){
              if(ospatar.eAranjataMasa(masa1)){
                  return "Luati loc la masa " + masa1.getNrMasa();
              }
              else {
                  return "Asteptati sa aranjam masa.";
              }
          } else {
              return "Asteptati sa se ridice cineva pentru a debarasa!";
          }
        } else {
            return "Momentan masa " + masa1.getNrMasa() + " nu este disponibila!";
        }
    }
}
