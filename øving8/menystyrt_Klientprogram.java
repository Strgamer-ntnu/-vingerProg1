package øving8;
import static javax.swing.JOptionPane.*;

import øving5.MinRandom;
import øving5.MinRandom.*;

public class menystyrt_Klientprogram {
    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();
        String fornavn = showInputDialog("Skriv inn Fornavn: ");
        String etternavn = showInputDialog("Skriv inn Etternavn: ");
        String fødselsår_str = showInputDialog("Skriv inn Fødselsår: ");
        try {
            int fødselsår = Integer.parseInt(fødselsår_str);
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ugyldig tall");
                System.exit(1);
                }
        int fødselsår = Integer.parseInt(fødselsår_str);

        Person person = new Person(fornavn, etternavn, fødselsår);
        String ut = "Lagde person: \nFornavn: "+person.getFornavn()+"\nEtternavn: "+person.getEtternavn()+"\nFødselsår: "+person.getFødselsår();
        showMessageDialog(null, ut);
        int arbtakernr = minRandom.nesteHeltall(100000, 999999);
        int ansettelsesår =0;
        if (fødselsår+16<2023){
            ansettelsesår = minRandom.nesteHeltall(fødselsår+16, 2023);
        }
        else {
            ansettelsesår = minRandom.nesteHeltall(fødselsår+16,fødselsår+90);
        }
        double månedslønn = minRandom.nesteDesimaltall(10000, 100000);
        double skatteprosent = minRandom.nesteDesimaltall(0, 100);
        ArbTaker arbTaker = new ArbTaker(person, arbtakernr, ansettelsesår, (float)månedslønn, (float)skatteprosent);
        String endreTall = " ";

        while (endreTall != null && endreTall.equals("")==false){
            ut = "Navn: "+arbTaker.getFullNavnFancy() 
            +"\n"+"Alder: "+arbTaker.getAlder()
            +"\n"+"1: Ansettelsesår:"+arbTaker.getAnsettelsesår()
            +"\n"+"2: Arbeidernr: "+arbTaker.getArbtakernr()
            +"\n"+"3: Månedslønn: "+arbTaker.getMånedslønn()
            +"\n"+"4: Skatteprosent: "+arbTaker.getSkatteprosent()
            +"\n"+"Skatt per måned:"+arbTaker.skattPerMåned()
            +"\n"+"Bruttolønn per år: "+ arbTaker.bruttoLønnPerÅr()
            +"\n"+"Skatt per år: "+arbTaker.skattPerÅr()
            +"\n"+"Antall år ansatt: "+arbTaker.getAntallÅrAnsatt()
            +"\n"+"Er ansatt lenger enn 30 år = "+arbTaker.ansattLengerEnn(30)
            +"\n"+ "Skriv inn tall for å endre de mulige verdiene: ";
            endreTall = showInputDialog(null,ut);
            if (endreTall == null || endreTall.equals("")) {
                showMessageDialog(null, "Avslutter");
            }
            else{
                int endreTallInt = 0;
                try {
                endreTallInt = Integer.parseInt(endreTall);
                } catch (NumberFormatException e) {
                    showMessageDialog(null, "Ugyldig tall");
                    continue;
                }
            
                switch (endreTallInt) {
                    case 1:
                        String ansettelsesår_str = showInputDialog("Skriv inn nytt ansettelsesår: ");
                        try {
                        int ansettelsesår_ny = Integer.parseInt(ansettelsesår_str);
                        } catch (NumberFormatException e) {
                            showMessageDialog(null, "Ugyldig tall");
                            continue;
                        }
                        int ansettelsesår_ny = Integer.parseInt(ansettelsesår_str);
                        arbTaker.setAnsettelsesår(ansettelsesår_ny);
                        break;
                    case 2:
                        String arbtakernr_str = showInputDialog("Skriv inn nytt arbtakernr: ");
                        try {
                        int arbtakernr_ny = Integer.parseInt(arbtakernr_str);
                        } catch (NumberFormatException e) {
                            showMessageDialog(null, "Ugyldig tall");
                            continue;
                        }
                        int arbtakernr_ny = Integer.parseInt(arbtakernr_str);
                        arbTaker.setArbeiternr(arbtakernr_ny);
                        break;
                    case 3:
                        String månedslønn_str = showInputDialog("Skriv inn ny månedslønn: ");
                        månedslønn_str=månedslønn_str.replace(" ","");
                        try {
                        double månedslønn_ny = Double.parseDouble(månedslønn_str);
                        } catch (NumberFormatException e) {
                            showMessageDialog(null, "Ugyldig tall");
                            continue;
                        }
                        double månedslønn_ny = Double.parseDouble(månedslønn_str);
                        arbTaker.setMånedslønn((float)månedslønn_ny);
                        break;
                    case 4:
                        String skatteprosent_str = showInputDialog("Skriv inn ny skatteprosent: ");
                        skatteprosent_str=skatteprosent_str.replace(" ","");
                        try {
                        double skatteprosent_ny = Double.parseDouble(skatteprosent_str);
                        } catch (NumberFormatException e) {
                            showMessageDialog(null, "Ugyldig tall");
                            continue;
                        }
                        double skatteprosent_ny = Double.parseDouble(skatteprosent_str);
                        arbTaker.setSkatteprosent((float)skatteprosent_ny);
                        break;
                    default:
                        showMessageDialog(null, "Ugyldig valg");
                        break;
                }

            }
        }
    }
}
