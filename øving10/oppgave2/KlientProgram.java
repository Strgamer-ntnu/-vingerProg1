package øving10.oppgave2;
import  static javax.swing.JOptionPane.*;

import java.util.ArrayList;

public class KlientProgram {
    public static void main(String[] args) {
        menyRegister register = new menyRegister();
        register.leggTilRett(new rett("Pepperonipizza", "Ha saus og ost på pizzabunn, før du putter på massevis av pepperoni", 123, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Kjøttkaker", "Lag kjøttkaker, server med poteter og brun saus", 83, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Lasagne", "Lag lasagne med kjøttsaus og ostesaus", 150, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Fiskegrateng", "Lag fiskegrateng med fiskefilet, poteter og grønnsaker", 120, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Tomatsuppe", "Lag tomatsuppe med tomater, løk og krydder", 70, typerRetter.FORRETT));
        register.leggTilRett(new rett("Salat", "Lag salat med grønnsaker, ost og dressing", 60, typerRetter.FORRETT));
        register.leggTilRett(new rett("Brød", "Lag brød med mel, vann og gjær", 50, typerRetter.FORRETT));
        register.leggTilRett(new rett("Sjokoladekake", "Lag sjokoladekake med sjokolade og kake", 110, typerRetter.DESSERT));
        register.leggTilRett(new rett("Sjokoladefondant", "Lag sjokoladefondant med flytende sjokolade inni", 100, typerRetter.DESSERT));
        register.leggTilRett(new rett("Panna cotta", "Lag panna cotta med vanilje og bær", 90, typerRetter.DESSERT));
        register.leggTilRett(new rett("Iskrem", "Lag iskrem med vanilje, sjokolade og jordbær", 80, typerRetter.DESSERT));
        register.leggTilRett(new rett("Karamellpudding", "Lag karamellpudding med karamell og vanilje", 70, typerRetter.DESSERT));
        register.leggTilRett(new rett("Grillet asparges med parmesan og balsamico", "Grill asparges og strø over revet parmesan, drypp balsamico over før servering", 90, typerRetter.FORRETT));
        register.leggTilRett(new rett("Rekecocktail med avokado", "Bland reker og avokado med en kremet dressing, server i glass", 120, typerRetter.FORRETT));
        register.leggTilRett(new rett("Fersk tomat- og basilikumsalat", "Skjær tomater i skiver, legg basilikumblader over, drypp olivenolje og balsamico, krydre med salt og pepper", 70, typerRetter.FORRETT));
        register.leggTilRett(new rett("Biff stroganoff med fløte og sopp", "Stek biff i en kremet saus med sopp og løk", 150, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Tandoori kylling med nanbrød", "Mariner kylling i tandoori-krydder, server med nanbrød og raita", 130, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Vegetarisk wok med sesam og soyasaus", "Wok grønnsaker med soyasaus og sesamfrø, server med ris", 100, typerRetter.HOVEDRETT));
        register.leggTilRett(new rett("Eplepai med kanel og vaniljeis", "Bak eplepai med kanel og server med en kule vaniljeis", 110, typerRetter.DESSERT));
        register.leggTilRett(new rett("Pistasjis med nøtter og honning", "Lag pistasjis og pynt med hakkede nøtter og honning", 95, typerRetter.DESSERT));
        register.leggTilRett(new rett("Sitronterte med marengs", "Lag sitronterte og topp med marengs, stek gyllenbrun", 120, typerRetter.DESSERT));


        register.leggTilMeny(new meny("Rar samling av retter", new rett[] {register.finnRettMedNavn("Salat"), register.finnRettMedNavn("Pepperonipizza"), register.finnRettMedNavn("Iskrem")}));
        register.leggTilMeny(new meny("Tradisjonell norsk meny", new rett[] {register.finnRettMedNavn("Tomatsuppe"), register.finnRettMedNavn("Kjøttkaker"), register.finnRettMedNavn("Karamellpudding")}));
        register.leggTilMeny(new meny("Italiensk meny", new rett[] {register.finnRettMedNavn("Salat"), register.finnRettMedNavn("Lasagne"), register.finnRettMedNavn("Sjokoladefondant")}));
        register.leggTilMeny(new meny("Meny til glede", new rett[] {register.finnRettMedNavn("Grillet asparges med parmesan og balsamico"), register.finnRettMedNavn("Biff stroganoff med fløte og sopp"), register.finnRettMedNavn("Eplepai med kanel og vaniljeis")}));
        register.leggTilMeny(new meny("Nydelige hovedretter", new rett[] {register.finnRettMedNavn("Rekecocktail med avokado"), register.finnRettMedNavn("Tandoori kylling med nanbrød"), register.finnRettMedNavn("Pistasjis med nøtter og honning")}));
        register.leggTilMeny(new meny("Deilige desserter", new rett[] {register.finnRettMedNavn("Fersk tomat- og basilikumsalat"), register.finnRettMedNavn("Vegetarisk wok med sesam og soyasaus"), register.finnRettMedNavn("Sitronterte med marengs")}));
        
        int valg = 0;
        showMessageDialog(null, "Velkommen til menyregisteret");
        while (valg != 6) {
            String valgStr=showInputDialog(null,"1 for å legge til rett\n2 for å finne rett med navn\n3 for å finne retter med type\n4 for å legge til meny\n5 for å finne menyer med totalpris i intervall\n6 for å avslutte");
            try{
                valg = Integer.parseInt(valgStr.trim());
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ugyldig valg");
            }
            switch (valg) {
                case 1:
                    // legg til rett
                    String navn = showInputDialog("Skriv inn navn: ");
                    String oppskrift = showInputDialog("Skriv inn oppskriften: ");
                    String prisStr = showInputDialog("Skriv inn prisen: ");
                    int pris = Integer.parseInt(prisStr.trim());
                    String typeStr = showInputDialog("Skriv inn typen, 1 for Forrett, 2 for Hovedrett, 3 for Dessert: ");
                    int typeInt = Integer.parseInt(typeStr.trim());
                    typerRetter type = typerRetter.FORRETT; //default
                    switch (typeInt) {
                        case 1:
                            type = typerRetter.FORRETT;
                            break;
                        case 2:
                            type = typerRetter.HOVEDRETT;
                            break;
                        case 3:
                            type = typerRetter.DESSERT;
                            break;
                        default:
                            showMessageDialog(null, "Ugyldig valg");
                            break;
                    }
                    register.leggTilRett(new rett(navn, oppskrift, pris, type));
                    showMessageDialog(null, "Rett lagt til");
                    break;
                case 2:
                    // finn rett med navn
                    rett funnetrett = register.finnRettMedNavn(showInputDialog("Skriv inn navn: "));
                    if (funnetrett != null) {
                        showMessageDialog(null, funnetrett.toString());
                    }
                    else {
                        showMessageDialog(null, "Fant ikke rett");
                    }
                    break;
                case 3:
                    // finn retter med type
                    String typeStr2 = showInputDialog("Skriv inn typen, 1 for Forrett, 2 for Hovedrett, 3 for Dessert: ");
                    int typeInt2 = Integer.parseInt(typeStr2.trim());
                    typerRetter type2 = typerRetter.FORRETT; //default
                    switch (typeInt2) {
                        case 1:
                            type2 = typerRetter.FORRETT;
                            break;
                        case 2:
                            type2 = typerRetter.HOVEDRETT;
                            break;
                        case 3:
                            type2 = typerRetter.DESSERT;
                            break;
                        default:
                            showMessageDialog(null, "Ugyldig valg");
                            break;
                    }
                    ArrayList<rett> retter = register.finnRetterMedType(type2);
                    String retterString = "";
                    for (rett rett : retter) {
                        retterString += rett.toString()+"\n";
                    }
                    showMessageDialog(null, retterString);
                    break;
                case 4:
                    // legg til meny
                    String menyNavn = showInputDialog("Skriv inn navn: ");
                    String retterValg="";
                    for (int i = 0; i < register.finnRetterMedType(typerRetter.FORRETT).size(); i++) {
                        retterValg += i + " for " + register.finnRetterMedType(typerRetter.FORRETT).get(i).getNavn() + "\n";
                    }
                    String forrettValgStr = showInputDialog("Velg forrett:\n" + retterValg);
                    int forrettValg = Integer.parseInt(forrettValgStr.trim());
                    rett forrett = register.finnRetterMedType(typerRetter.FORRETT).get(forrettValg);
                    
                    retterValg="";
                    for (int i = 0; i < register.finnRetterMedType(typerRetter.HOVEDRETT).size(); i++) {
                        retterValg += i + " for " + register.finnRetterMedType(typerRetter.HOVEDRETT).get(i).getNavn() + "\n";
                    }
                    String hovedrettValgStr = showInputDialog("Velg hovedrett:\n" + retterValg);
                    int hovedrettValg = Integer.parseInt(hovedrettValgStr.trim());
                    rett hovedrett = register.finnRetterMedType(typerRetter.HOVEDRETT).get(hovedrettValg);

                    retterValg="";
                    for (int i = 0; i < register.finnRetterMedType(typerRetter.DESSERT).size(); i++) {
                        retterValg += i + " for " + register.finnRetterMedType(typerRetter.DESSERT).get(i).getNavn() + "\n";
                    }
                    String dessertValgStr = showInputDialog("Velg dessert:\n" + retterValg);
                    int dessertValg = Integer.parseInt(dessertValgStr.trim());
                    rett dessert = register.finnRetterMedType(typerRetter.DESSERT).get(dessertValg);

                    register.leggTilMeny(new meny(menyNavn, new rett[] {forrett, hovedrett, dessert}));
                    break;
                case 5:
                    // finn menyer med totalpris i intervall
                    String startPrisStr = showInputDialog("Skriv inn startpris: ");
                    int startPris = Integer.parseInt(startPrisStr.trim());
                    String sluttPrisStr = showInputDialog("Skriv inn sluttpris: ");
                    int sluttPris = Integer.parseInt(sluttPrisStr.trim());

                    String menyerString = "";
                    for (meny meny : register.finnMenyerMedTotalprisIIntervall(startPris, sluttPris))
                    {
                        menyerString += meny.toString() + "\n";
                    }
                    showMessageDialog(null, menyerString);
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
