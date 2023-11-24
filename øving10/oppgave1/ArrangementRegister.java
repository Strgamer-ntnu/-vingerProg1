package øving10.oppgave1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrangementRegister {

    private ArrayList<Arrangement> arrangementer = new ArrayList<>();

    public void leggTilArrangement(Arrangement arrangement) {
        arrangementer.add(arrangement);
    }
    public ArrayList<Arrangement> finnArrangementerVedSted(String sted) {
        ArrayList<Arrangement> funnetArrangementer = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).erVedSted(sted)) {
                funnetArrangementer.add(arrangementer.get(i));
            }
        }
        if (funnetArrangementer.size() == 0) {
            return null;
        }
        return funnetArrangementer;
    }
    public ArrayList<Arrangement> finnArrangementerPåDato(Long dato) {
        ArrayList<Arrangement> funnetArrangementer = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).getTidspunkt() >= dato && arrangementer.get(i).getTidspunkt() < dato + 10000) {
                funnetArrangementer.add(arrangementer.get(i));
            }
        }
        if (funnetArrangementer.size() == 0) {
            return null;
        }
        return funnetArrangementer;
    }
    public ArrayList<Arrangement> finnArrangementerIIntervall(Long startdato, Long sluttdato) {

        ArrayList<Arrangement> funnetArrangementer = new ArrayList<>();
        for (int i = 0; i < arrangementer.size(); i++) {
            if (arrangementer.get(i).getTidspunkt() >= startdato && arrangementer.get(i).getTidspunkt() < sluttdato) {
                funnetArrangementer.add(arrangementer.get(i));
            }
        }
        if (funnetArrangementer.size() == 0) {
            return null;
        }
        else {
            //sorter etter tid
            Collections.sort(funnetArrangementer, Comparator.comparingLong(Arrangement::getTidspunkt));
        }
        return funnetArrangementer;
    }
    public ArrayList<Arrangement> getArrangementer(String sortBy ) {
        if (sortBy == null ){
            sortBy = "tid";
        }
        ArrayList<Arrangement> arrangementer = (ArrayList<Arrangement>)this.arrangementer.clone();
        if (sortBy.equals("tid")) {
            Collections.sort(arrangementer, Comparator.comparingLong(Arrangement::getTidspunkt));
        }
        else if (sortBy.equals("sted")) {
            Collections.sort(arrangementer, Comparator.comparing(Arrangement::getSted));
        }
        else if (sortBy.equals("type")) {
            Collections.sort(arrangementer, Comparator.comparing(Arrangement::getType));
        }
        return arrangementer;
    }
}
