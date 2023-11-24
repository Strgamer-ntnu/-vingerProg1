import java.util.Scanner;
public class ø1_oppgave2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Skriv inn timer: ");
        int timer = reader.nextInt();

        System.out.print("Skriv inn minutter: ");
        int minutter = reader.nextInt();

        System.out.print("Skriv inn sekunder: ");
        int sekunder = reader.nextInt();

        System.out.println(timer +" timer, "+minutter + " minutter og "+sekunder+" sekunder blir til sammen "+(sekunder+minutter*60+timer*3600));
        
    }
}

