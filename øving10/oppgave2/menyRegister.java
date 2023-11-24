package øving10.oppgave2;

import java.util.ArrayList;
import java.util.List;

public class menyRegister {
    private ArrayList<meny> menyListe = new ArrayList<>();
    private ArrayList<rett> forrettListe = new ArrayList<>();
    private ArrayList<rett> hovedrettListe  = new ArrayList<>();
    private ArrayList<rett> dessertListe = new ArrayList<>();

    public void leggTilRett(rett rett) {
        if (rett.getRettIsType(typerRetter.FORRETT)) {
            forrettListe.add(rett);
        }
        else if (rett.getRettIsType(typerRetter.HOVEDRETT)) {
            hovedrettListe.add(rett);
        }
        else if (rett.getRettIsType(typerRetter.DESSERT)) {
            dessertListe.add(rett);
        }
    }
    public rett finnRettMedNavn(String navn) {
        for (rett rett : forrettListe) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }
        for (rett rett : hovedrettListe) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }
        for (rett rett : dessertListe) {
            if (rett.getNavn().equals(navn)) {
                return rett;
            }
        }
        return null;
    }
    public ArrayList<rett> finnRetterMedType(typerRetter type) {
        if (type == typerRetter.FORRETT) {
            return (ArrayList<rett>)forrettListe.clone();
        }
        else if (type == typerRetter.HOVEDRETT) {
            return (ArrayList<rett>)hovedrettListe.clone();
        }
        else if (type == typerRetter.DESSERT) {
            return (ArrayList<rett>)dessertListe.clone();
        }
        return null;
    }
    public void leggTilMeny(meny meny) {
        menyListe.add(meny);
    }
    public ArrayList<meny> finnMenyerMedTotalprisIIntervall(int startPris, int sluttPris) {
        ArrayList<meny> funnetMenyer = new ArrayList<>();
        for (meny meny : menyListe) {
            if (meny.getTotalPrisIIntervall(startPris, sluttPris)) {
                funnetMenyer.add(meny);
            }
        }
        return funnetMenyer;
    }

}
