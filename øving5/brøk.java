package øving5;
import java.util.Scanner;
public class brøk {
    public int teller;
    public int nevner;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 for teller og nevner, 2 for bare teller: ");
        int valg = scanner.nextInt();
        brøk brøk_1 = null;
        switch (valg) {
            case 1:
                System.out.println("Skriv inn teller og nevner for brøk 1: ");
                brøk_1 = new brøk(scanner.nextInt(), scanner.nextInt());
                break;
            case 2:
                System.out.println("Skriv inn teller for brøk 1: ");
                brøk_1 = new brøk(scanner.nextInt());
                break;
            default:
                System.out.println("Ugyldig valg");
                System.exit(1);
                break;
        }
        while (true) {
            System.out.println("\n1 for summering, 2 for subtraksjon, 3 for multiplikasjon, 4 for divisjon, 5 for avslutt: ");
            int valg2 = scanner.nextInt();
            System.out.println("Skriv inn teller og nevner for brøk 2: ");
            switch (valg2) {
                case 1:
                    brøk_1.summer(new brøk(scanner.nextInt(), scanner.nextInt()));
                    System.out.println(brøk_1.getBrøk());
                    break;
                case 2:
                    brøk_1.subtraher(new brøk(scanner.nextInt(), scanner.nextInt()));
                    System.out.println(brøk_1.getBrøk());
                    break;
                case 3:
                    brøk_1.gange(new brøk(scanner.nextInt(), scanner.nextInt()));
                    System.out.println(brøk_1.getBrøk());
                    break;
                case 4:
                    brøk_1.divider(new brøk(scanner.nextInt(), scanner.nextInt()));
                    System.out.println(brøk_1.getBrøk());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldig valg");
                    System.exit(1);
                    break;
            }
        }
    
    }
    public brøk(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }
    public brøk(int teller, int nevner) {
        this.teller = teller;
        try {
            if (nevner == 0) {
                throw new IllegalArgumentException("nevner kan ikke være 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        this.nevner = nevner;
    }

    public String getBrøk() {

        return teller + "/" + nevner;
    }
    public void summer(brøk brøk2) {
        int nyTeller = teller * brøk2.nevner + brøk2.teller * nevner;
        int nyNevner = nevner * brøk2.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;
        reduser();
    }
    public void subtraher(brøk brøk2) {
        int nyTeller = teller * brøk2.nevner - brøk2.teller * nevner;
        int nyNevner = nevner * brøk2.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;
        reduser();
    }
    public void gange(brøk brøk2) {
        int nyTeller = teller * brøk2.teller;
        int nyNevner = nevner * brøk2.nevner;
        this.teller = nyTeller;
        this.nevner = nyNevner;
        reduser();
    }
    public void divider(brøk brøk2) {
        int nyTeller = teller * brøk2.nevner;
        int nyNevner = nevner * brøk2.teller;
        this.teller = nyTeller;
        this.nevner = nyNevner;
        reduser();
    }
    public void reduser() {
        for (int i = 2*teller/Math.abs(teller); i <= teller; i+=teller/Math.abs(teller)) {
            if (teller % i == 0 && nevner % i == 0) {
                teller /= i;
                nevner /= i;
                i = 1;
            }
        }
    }
}
