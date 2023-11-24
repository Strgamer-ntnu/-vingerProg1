package øving9;
import static javax.swing.JOptionPane.*;

public class testOppgaveoversikt {
    public static void main(String[] args) {
        
        Oppgaveoversikt oversikt = new Oppgaveoversikt();
        int valg = 0;
        while (valg != 5) {
            String out = oversikt.toString() +"\n 1 for å legge til student\n 2 for å legge til oppgaver\n 3 for å finne antall oppgaver til en student\n 4 for å finne antall oppgaver til alle studenter\n 5 for å avslutte";
            String valg_str=showInputDialog(null,out);
            try{
                valg = Integer.parseInt(valg_str.trim());
            } catch (NumberFormatException e) {
                showMessageDialog(null, "Ugyldig valg");
            }
            valg = Integer.parseInt(valg_str.trim());
            switch (valg) {
                case 1:
                    String navn = showInputDialog("Skriv inn navn: ");
                    Student student = new Student(navn);
                    showMessageDialog(null, student.toString()+" er lagt til");
                    oversikt.registrerStudent(student);
                    break;
                case 2:
                    String navn2 = showInputDialog(oversikt.getStudenterString()+"\nSkriv inn navn: ");
                    String antOppg_str = showInputDialog("Skriv inn antall oppgaver: ");
                    try {
                        int antOppg = Integer.parseInt(antOppg_str);
                    } catch (NumberFormatException e) {
                        showMessageDialog(null, "Ugyldig tall");
                        System.exit(1);
                    }
                    int antOppg = Integer.parseInt(antOppg_str);
                    oversikt.økAntOppg(navn2, antOppg);
                    showMessageDialog(null, antOppg+" oppgaver lagt til "+navn2);
                    break;
                case 3:
                    
                    String navn3 = showInputDialog(oversikt.getStudenterString()+"\nSkriv inn navn: ");
                    showMessageDialog(null,navn3+" Har gjort "+ oversikt.finnAntOppgaver(navn3)+" Oppgaver");
                    break;
                case 4:
                    showMessageDialog(null, oversikt.toString());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    showMessageDialog(null, "Ugyldig valg");
                    break;
            }
        }


        

    }
}
