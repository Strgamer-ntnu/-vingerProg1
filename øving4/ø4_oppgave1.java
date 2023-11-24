package øving4;
import static javax.swing.JOptionPane.*;
public class ø4_oppgave1 {
    public static void main(String[] args) {
        valuta dollar = new valuta(10.72f);
        valuta euro = new valuta(11.59f);
        valuta sek = new valuta(0.97f);

        int valuta = 0;
        int to_or_from = 0;
        while (valuta != 4) {
            String val_str = showInputDialog("1: dollar\r\n2: euro\r\n3: svenske kroner\r\n4: avslutt ");
            if (val_str == null) {
                showMessageDialog(null, "Avslutter");
                break;
            }
            valuta = Integer.parseInt(val_str);
            if (valuta >= 4 || valuta <= 0) {
                showMessageDialog(null, "Avslutter");
                break;
            }
            String t_or_f = showInputDialog("1: til nok\r\n2: fra nok");
            if (val_str == null) {
                showMessageDialog(null, "Avslutter");
                break;
            }
            to_or_from = Integer.parseInt(t_or_f);
            switch (valuta) {
            case 1:
                switch (to_or_from) {
                    case 1:
                        String dollar_str = showInputDialog("Skriv inn antall dollar: ");
                        float dollar_f = Float.parseFloat(dollar_str);
                        showMessageDialog(null, dollar_f + " dollar = "+dollar.toNok(dollar_f)+" nok");
                        break;
                    case 2:
                        String nok_str = showInputDialog("Skriv inn antall nok: ");
                        float nok = Float.parseFloat(nok_str);
                        showMessageDialog(null, nok + " nok = "+dollar.fromNok(nok)+" dollar");
                        break;
                    default:
                        showMessageDialog(null, "Ugyldig valg");
                        break;
                
                }
                break;  
            case 2:
                switch (to_or_from) {
                    case 1:
                        String euro_str = showInputDialog("Skriv inn antall euro: ");
                        float euro_f = Float.parseFloat(euro_str);
                        showMessageDialog(null, euro_f + " euro = "+euro.toNok(euro_f)+" nok");
                        break;
                    
                    case 2:
                        String nok_str = showInputDialog("Skriv inn antall nok: ");
                        float nok = Float.parseFloat(nok_str);
                        showMessageDialog(null, nok + " nok = "+euro.fromNok(nok)+" euro");
                        break;  
                    
                    default:
                        showMessageDialog(null, "Ugyldig valg");
                        break;
                }
                break;
            case 3:
            
                switch (to_or_from) {
                    case  1:
                        String sek_str = showInputDialog("Skriv inn antall sek: ");
                        float sek_f = Float.parseFloat(sek_str);
                        showMessageDialog(null, sek_f + " sek = "+sek.toNok(sek_f)+" nok");
                        break;
                    
                    case 2:
                        String nok_str = showInputDialog("Skriv inn antall nok: ");
                        float nok = Float.parseFloat(nok_str);
                        showMessageDialog(null, nok + " nok = "+sek.fromNok(nok)+" sek");
                        break;
                    default:
                        showMessageDialog(null, "Ugyldig valg");
                        break;
                }
                break;
            default:
                showMessageDialog(null, "Ugyldig valg");
                break;
            }
                
        }
    }

}

