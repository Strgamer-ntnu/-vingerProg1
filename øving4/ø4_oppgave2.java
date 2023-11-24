package øving4;
import java.util.Scanner;

public class ø4_oppgave2 {
    public static void main(String[] args) {
        spiller spiller1 = new spiller();
        spiller spiller2 = new spiller();
        
        Scanner scanner = new Scanner(System.in);
        boolean manuel = false;

        // velger om det må være akkuratt 100 for å vinne
        // spiller1.setAvansert(true);
        // spiller2.setAvansert(true);
        
        int i = 1;
        while (spiller1.getPoeng() < 100 && spiller2.getPoeng() < 100) {
            if (manuel){
                scanner.nextLine();
            }
            spiller1.kastTerning();
            spiller2.kastTerning();
            System.out.println("");
            System.out.println("Runde " + i++ + ":");
            System.out.println("Spiller 1: " + spiller1.getPoeng() + "; Spiller 2: " + spiller2.getPoeng());

        }
        scanner.close();
        if (spiller1.getPoeng() > spiller2.getPoeng()) {
            System.out.println("Spiller 1 vant");
        } else {
            System.out.println("Spiller 2 vant");
        }
    }
}
