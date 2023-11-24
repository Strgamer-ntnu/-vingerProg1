package øving5;
import java.util.Random;
import java.util.Scanner;
public class MinRandom {

    public static void main(String[] args) {
        MinRandom minRandom = new MinRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 for heltall, 2 for desimaltall: ");
        int valg = scanner.nextInt();
        switch (valg) {
            case 1:
                System.out.println("Skriv inn nedre og øvre grense: ");
                System.out.println("Det tilfeldige tallet er "+minRandom.nesteHeltall(scanner.nextInt(), scanner.nextInt()));
                break;
            case 2:
                System.out.println("Skriv inn nedre og øvre grense: ");
                System.out.println("Det tilfeldige tallet er "+minRandom.nesteDesimaltall(scanner.nextDouble(), scanner.nextDouble()));
                break;
            default:
                System.out.println("Ugyldig valg");
                System.exit(1);
                break;
        }

    }
    Random random = new Random();
    public int nesteHeltall(int nedre, int ovre) {
        return random.nextInt(ovre - nedre + 1) + nedre;
    }
    public double nesteDesimaltall(double nedre, double ovre) {
        return random.nextDouble() *(ovre-nedre)+nedre;
    }
}
