import java.util.Scanner;
public class ø1_oppgave3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Skriv inn sekunder: ");

        int sekunder = reader.nextInt();
        int timer = (sekunder/3600);
        int minutter = (sekunder-3600*timer)/60;
        int sekunderRest = (sekunder-3600*timer-60*minutter);
        
        System.out.println(sekunder +" sekunder kan gjøres til "+ timer + " timer, "+minutter + " minutter og "+sekunderRest+" sekunder");
            }
        
    
    
}
