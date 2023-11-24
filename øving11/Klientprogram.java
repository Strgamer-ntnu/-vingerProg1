package øving11;

import java.util.ArrayList;

import static javax.swing.JOptionPane.*;

public class Klientprogram {

    public static void main(String[] args) {
        EiendomsRegister register = new EiendomsRegister();
        register.leggTilEiendom(new Eiendom(1445, "Gloppen", 77, 631, "", 1017.6F, "Jens Olsen"));
        register.leggTilEiendom(new Eiendom(1445, "Gloppen", 77, 131, "Syningom", 661.3F, "Nicolay Madsen"));
        register.leggTilEiendom(new Eiendom(1445, "Gloppen", 75, 19, "Fugletun", 650.6F, "Evilyn Jensen"));
        register.leggTilEiendom(new Eiendom(1445, "Gloppen", 74, 188, "", 1457.2F, "Karl Ove Bråten"));
        register.leggTilEiendom(new Eiendom(1445, "Gloppen", 69, 47, "Høiberg", 1339.4F, "Elsa Indregård"));

        //definer variabler for senere bruk
        String KommuneNrString = null;
        String KommuneNavn = null;
        String GardsNrString = null;
        String BruksNrString = null;
        String BruksNavn = null;
        String ArealString = null;
        String Eier = null;

        int KommuneNr = 0;
        int GardsNr = 0;
        int BruksNr = 0;
        float Areal = 0;

        int valg = 0;
        while (valg != 8) {
            String valgString = showInputDialog(null,
                    "1 for å legge til eiendom\n2 for å slette eiendom\n3 for å søke etter eiendom" +
                            "\n4 for å finne eiendommer med gardsnr\n5 for å finne snittareal" +
                            "\n6 for å vise eiendommer\n7 for å vise antall eiendommer\n8 for å avslutte");
            if (valgString == null || valgString.trim().equals("")) {
                valg = 8;

            }
            else {
                valg = Integer.parseInt(valgString.trim());
            }
            switch (valg) {
                case 1:
                    // legge til eiendom
                    KommuneNrString = showInputDialog(null, "Skriv inn kommunenummer");
                    try {
                        KommuneNr = Integer.parseInt(KommuneNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig kommunenummer");
                        break;
                    }
                    
                    KommuneNavn = showInputDialog(null, "Skriv inn kommunenavn");
                    GardsNrString = showInputDialog(null, "Skriv inn gardsnummer");
                    try {
                        GardsNr = Integer.parseInt(GardsNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig gardsnummer");
                        break;
                    }
                    
                    BruksNrString = showInputDialog(null, "Skriv inn bruksnummer");
                    try {
                        BruksNr = Integer.parseInt(BruksNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig bruksnummer");
                        break;
                    }
                    
                    BruksNavn = showInputDialog(null, "Skriv inn bruksnavn");
                    ArealString = showInputDialog(null, "Skriv inn areal");
                    try {
                        Areal = Float.parseFloat(ArealString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig areal");
                        break;
                    }
                    
                    Eier = showInputDialog(null, "Skriv inn eier");
                    
                    
                    register .leggTilEiendom(new Eiendom(KommuneNr, KommuneNavn, GardsNr, BruksNr, BruksNavn, Areal, Eier));
                    break;

                case 2:
                    // slette eiendom
                    KommuneNrString = showInputDialog(null, "Skriv inn kommunenummer på eiendommen du vil slette");
                    try {
                        KommuneNr = Integer.parseInt(KommuneNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig kommunenummer");
                        break;
                    }
                    
                    GardsNrString = showInputDialog(null, "Skriv inn gardsnummer på eiendommen du vil slette");
                    try {
                        GardsNr = Integer.parseInt(GardsNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig gardsnummer");
                        break;
                    }
                    
                    BruksNrString = showInputDialog(null, "Skriv inn bruksnummer på eiendommen du vil slette");
                    try {
                        BruksNr = Integer.parseInt(BruksNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig bruksnummer");
                        break;
                    }


                    Eiendom eiendom = register.sokEtterEiendom(KommuneNr, GardsNr, BruksNr);
                    if (eiendom == null) {
                        showMessageDialog(null, "Fant ikke eiendommen");
                        break;
                    }
                    register.slettEiendom(eiendom);
                    showMessageDialog(null, "Eiendommen ble slettet");
                    showMessageDialog(null, "Stakkars " + eiendom.getEier());

                    break;
                case 3:
                    // søke etter eiendom
                    KommuneNrString = showInputDialog(null, "Skriv inn kommunenummer");
                    try {
                        KommuneNr = Integer.parseInt(KommuneNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig kommunenummer");
                        break;
                    }
                    
                    GardsNrString = showInputDialog(null, "Skriv inn gardsnummer");
                    try {
                        GardsNr = Integer.parseInt(GardsNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig gardsnummer");
                        break;
                    }
                    
                    BruksNrString = showInputDialog(null, "Skriv inn bruksnummer");
                    try {
                        BruksNr = Integer.parseInt(BruksNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig bruksnummer");
                        break;
                    }

                    Eiendom eiendom2 = register.sokEtterEiendom(KommuneNr, GardsNr, BruksNr);
                    if (eiendom2 != null) {
                        String outString = eiendom2.toStringLong();
                        showMessageDialog(null, outString);
                    } else {
                        showMessageDialog(null, "Fant ikke eiendommen");
                    }
                    break;
                case 4:
                    // finne eiendommer med gardsnr
                    GardsNrString = showInputDialog(null, "Skriv inn gardsnummer");
                    try {
                        GardsNr = Integer.parseInt(GardsNrString.trim());
                    } catch (Exception e) {
                        showMessageDialog(null, "Ugyldig gardsnummer");
                        break;
                    }
                    String outString = "";
                    for (Eiendom eiendom3 : register.eiendommerMedGardsNr(GardsNr)) {
                        outString += eiendom3.toStringLong() + "\n\n";
                    }
                    showMessageDialog(null, outString);
                    break;
                case 5:
                    // finne snittareal
                    showMessageDialog(null , "Snittareal: " + register.beregnSnittAreal() +" m^2");
                    break;
                case 6:
                    // vise eiendommer
                    ArrayList<Eiendom> eiendommer = register.getEiendommer();
                    int antallPerSide=8;
                    if (register.antallEiendommer()<=antallPerSide) {
                        outString = "";
                        for (Eiendom eiendom4 : eiendommer) {
                            outString += eiendom4.toStringLong() + "\n\n";
                        }
                        showMessageDialog(null, outString);
                    } else {
                        int antallSider = (int) Math.ceil((double) register.antallEiendommer() / antallPerSide);
                        for (int sideNr = 0; sideNr < antallSider; sideNr++) {
                            outString = "Side " + (sideNr + 1) + " av " + antallSider + "\n";
                            for (int i = 0; i < antallPerSide; i++) {
                                int index = sideNr * antallPerSide + i;
                                if (index < register.antallEiendommer()) {
                                    outString += eiendommer.get(index).toStringLong() + "\n\n";
                                }
                            }
                            showMessageDialog(null, outString);
                        }

                    }

                    break;
                case 7:
                    // vise antall eiendommer
                    showMessageDialog(null, "Antall eiendommer: " + register.antallEiendommer());
                    break;
                case 8:
                    // avslutte
                    showMessageDialog(null, "Avslutter");
                    break;
                default:
                    showMessageDialog(null, "Ugyldig valg");
                    break;
            }



        }
    }
}
