import java.util.Scanner;
public class ø2_oppgave1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Skriv inn årstall: ");
        int årstall = reader.nextInt();
        if ((årstall%4==0 && årstall%100!=0) || årstall%400==0) {
            System.out.println(årstall +" er et skuddår");
        }
        else {
            System.out.println(årstall+" er ikke et skuddår");
        }
    }
    
}
