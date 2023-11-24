package øving10.oppgave1;
import static javax.swing.JOptionPane.*;
import java.util.ArrayList;

import øving5.brøk;

public class KlientProgram {

    public static void main(String[] args) {
        ArrangementRegister register = new ArrangementRegister();
        register.leggTilArrangement(new Arrangement(1, "Konsert med DAGames", "Oslo", "John", ArrangementType.KONSERT, 202004151200L));
        register.leggTilArrangement(new Arrangement(2, "Konsert med JT Music", "Oslo", "Robert", ArrangementType.KONSERT, 201902211200L));
        register.leggTilArrangement(new Arrangement(3, "Konsert med DAGames", "Bergen", "John", ArrangementType.KONSERT, 202104151200L));
        register.leggTilArrangement(new Arrangement(4, "Foredrag med Neil deGrasse Tyson", "Trondheim", "Jane", ArrangementType.FOREDRAG, 202201011200L));
        register.leggTilArrangement(new Arrangement(5, "Teaterforestilling: Suppe", "Oslo", "William", ArrangementType.TEATER, 202112251200L));
        register.leggTilArrangement(new Arrangement(6, "Konsert med Rockit Music", "Oslo", "Lars", ArrangementType.KONSERT, 202206301200L));
        register.leggTilArrangement(new Arrangement(7, "Foredrag med Kongsperg gruppen", "Bergen", "Hans", ArrangementType.FOREDRAG, 202301011200L));
        register.leggTilArrangement(new Arrangement(8, "Teaterforestilling: For Honor", "Trondheim", "Julia", ArrangementType.TEATER, 202212251200L));
        register.leggTilArrangement(new Arrangement(9, "Konsert med Cam Steady", "Bergen", "Emma", ArrangementType.KONSERT, 202208301200L));
        register.leggTilArrangement(new Arrangement(10, "Foredrag med Nicola Tesla", "Oslo", "Marius", ArrangementType.FOREDRAG, 189401011200L));
        register.leggTilArrangement(new Arrangement(11, "Teaterforestilling: The Last of Us", "Trondheim", "Lars", ArrangementType.TEATER, 202212251200L));
        register.leggTilArrangement(new Arrangement(12, "Konsert med Cam Steady", "Oslo", "John", ArrangementType.KONSERT, 202302221200L));
        register.leggTilArrangement(new Arrangement(13, "Hvorfor Jormungandr er S tier", "Bergen", "Erlend", ArrangementType.FOREDRAG, 202301011200L));

        int valg = 0;
        while (valg != 6) {
            String out = "1 for å legge til nytt arrangement\n2 for å finne arrangementer ved sted\n3 for å finne arrangementer på dato\n4 for å finne arrangementer i et intervall\n5 for å vise alle arrangementer\n6 for å avslutte";
            String valg_str = showInputDialog(null, out);
            try {
                valg = Integer.parseInt(valg_str.trim());
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ugyldig valg");
            }
            valg = Integer.parseInt(valg_str.trim());
            switch (valg) {
                case 1:
                    //legg til nytt arrangement
                    int id = register.getArrangementer(null).size() + 1;
                    String navn = showInputDialog("Skriv inn navn på arrangementet: ");
                    String sted = showInputDialog("Skriv inn sted: ");
                    String arrangør = showInputDialog("Skriv inn arrangør: ");
                    String enumOut = "Skriv inn type: \n";

                    for (ArrangementType type : ArrangementType.values()) {
                        enumOut += type.ordinal() + " for " + type + "\n";
                    }
                    String type = showInputDialog(enumOut);
                    ArrangementType type_enum = ArrangementType.values()[Integer.parseInt(type)];
                    
                    String tidspunkt_str = showInputDialog("Skriv inn tidspunkt: ");
                    Long tidspunkt = 202301010900L; //default
                    try {
                        tidspunkt = Long.parseLong(tidspunkt_str);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        break;
                    }
                    while (tidspunkt < 100000000000L) tidspunkt*=10;
                    register.leggTilArrangement(new Arrangement(id, navn, sted, arrangør, type_enum, tidspunkt));
                    break;
                case 2:
                    //finn arrangementer ved sted
                    ArrayList<Arrangement> arrangementerVedSted = register.finnArrangementerVedSted(showInputDialog("Skriv inn sted: "));
                    if (arrangementerVedSted == null || arrangementerVedSted.size() == 0) {
                        showMessageDialog(null, "Ingen arrangementer funnet");
                        break;
                    }
                    String output = "";
                    for (int i = 0; i < arrangementerVedSted.size(); i++) {
                        output += arrangementerVedSted.get(i).toString() + "\n";
                    }
                    showMessageDialog(null, output);
                    break;
                case 3:
                    //finn arrangementer på dato
                    String dato_str = showInputDialog("Skriv inn dato på formen yyyymmdd: ");
                    Long dato = 20230101L; //default¨
                    try {
                        dato = Long.parseLong(dato_str);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        break;
                    }
                    while (dato < 100000000000L) dato*=10;
                    ArrayList<Arrangement> arrangementerPåDato = register.finnArrangementerPåDato(dato);
                    if (arrangementerPåDato == null || arrangementerPåDato.size() == 0) {
                        showMessageDialog(null, "Ingen arrangementer funnet");
                        break;
                    }
                    String output2 = "";
                    for (int i = 0; i < arrangementerPåDato.size(); i++) {
                        output2 += arrangementerPåDato.get(i).toString() + "\n";
                    }
                    showMessageDialog(null, output2);
                    break;
                case 4:
                    //finn arrangementer i et intervall
                    String startdato_str = showInputDialog("Skriv inn startdato på formen yyyymmdd: ");
                    Long startdato = 20220101L; //default
                    try {
                        startdato = Long.parseLong(startdato_str);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        break;
                    }

                    while (startdato < 100000000000L) startdato*=10;
                    
                    String sluttdato_str = showInputDialog("Skriv inn sluttdato på formen yyyymmdd: ");
                    Long sluttdato = 20230101L; //default
                    try {
                        sluttdato = Long.parseLong(sluttdato_str);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        break;
                    }
                    while (sluttdato < 100000000000L) sluttdato*=10;

                    ArrayList<Arrangement> arrangementerIIntervall = register.finnArrangementerIIntervall(startdato, sluttdato);
                    if (arrangementerIIntervall == null || arrangementerIIntervall.size() == 0) {
                        showMessageDialog(null, "Ingen arrangementer funnet");
                        break;
                    }
                    String output3 = "";
                    for (int i = 0; i < arrangementerIIntervall.size(); i++) {
                        output3 += arrangementerIIntervall.get(i).toString() + "\n";
                    }
                    showMessageDialog(null, output3);

                    break;
                case 5:
                    //vis alle arrangementer
                    String sortBy = showInputDialog("Skriv inn sorteringstype: \n 1 for tid \n 2 for sted \n 3 for type");
                    int sortBy_int = 1;
                    try {
                        sortBy_int = Integer.parseInt(sortBy);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        break;
                    }
                    switch(sortBy_int) {
                        case 1:
                            sortBy = "tid";
                            break;
                        case 2:
                            sortBy = "sted";
                            break;
                        case 3:
                            sortBy = "type";
                            break;
                        default:
                            showMessageDialog(null, "Ugyldig valg");
                            sortBy = null;
                            break;
                    }

                    ArrayList<Arrangement> alleArrangementer = register.getArrangementer(sortBy);


                    if (alleArrangementer == null || alleArrangementer.size() == 0) {
                        showMessageDialog(null, "Ingen arrangementer funnet");
                        break;
                    }

                    String output4 = "";
                    int antallPerSide = 10;
                    if (alleArrangementer.size() >antallPerSide )
                    {
                        int antallSider = (alleArrangementer.size() / antallPerSide) + 1;
                        for (int i = 0; i < antallSider; i++) {
                            output4 = "Side" + (i+1) + " av "+ antallSider +"\n" ;
                            for (int j = 0; j < antallPerSide; j++) {
                                if (i*antallPerSide + j >= alleArrangementer.size()) break;
                                output4 += alleArrangementer.get(i*antallPerSide + j).toString() + "\n";
                            }
                            showMessageDialog(null, output4);
                        }
                    }
                    else {
                        for (int i = 0; i < alleArrangementer.size(); i++) {
                            output4 += alleArrangementer.get(i).toString() + "\n";
                        }
                        showMessageDialog(null, output4);
                    }
                    break;
                case 6:
                    showMessageDialog(null,"Avslutter");
                    System.exit(0);
                    break;
                default:
                    showMessageDialog(null, "Ugyldig valg");
                    break;
            }
        }
    }

}
