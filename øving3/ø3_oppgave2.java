import java.util.Scanner;
public class ø3_oppgave2 {
    public static void main(String[] args) {
        
        while (true) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Skriv inn heltall:");
        int tall = reader.nextInt();
        boolean isPrime = true;
        for (int i=2; i<tall; i++) {
            if (tall%i==0) {
                isPrime=false;
            }
        }
        if (isPrime) {
            System.out.println(tall+" er et primtall");
        }
        else {
            System.out.println(tall+" er ikke et primtall");
        }
        }
    }
    
}

