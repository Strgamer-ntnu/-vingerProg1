package øving11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.*;

public class EiendomsRegister {
    
    //valgte HashMap fordi det gjør det enklere å søke etter eiendommer
    private HashMap<String, Eiendom> eiendommerMap = new HashMap<>();


    public void leggTilEiendom(Eiendom eiendom) {
        eiendommerMap.put(eiendom.toString(), eiendom);
    }
    public void slettEiendom(Eiendom eiendom) {
        eiendommerMap.remove(eiendom.toString());
    }
    public int antallEiendommer() {
        return eiendommerMap.size();
    }

    public ArrayList<Eiendom> getEiendommer() {
        return new ArrayList<>(eiendommerMap.values());
    }

    public Eiendom sokEtterEiendom(int Kommunenr, int Gardsnr, int Bruksnr) {
        return eiendommerMap.get(Kommunenr + "-" + Gardsnr + "/" + Bruksnr);
         
    }
    public ArrayList<Eiendom> eiendommerMedGardsNr(int Gardsnr) {
        ArrayList<Eiendom> funnetEiendommer = eiendommerMap.values().stream()
        .filter(eiendom -> eiendom.getGardsnr()==Gardsnr)
        .collect(Collectors.toCollection(ArrayList::new));
        return funnetEiendommer;
    }

    public float beregnSnittAreal() {
        float sum = 0;
        if (eiendommerMap.size()==0) {
            return 0;
        }
        for (Eiendom eiendom : eiendommerMap.values()) {
            sum += eiendom.getAreal();
        }
        return sum/eiendommerMap.size();
    }

}
