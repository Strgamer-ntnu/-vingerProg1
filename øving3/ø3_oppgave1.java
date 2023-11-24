import java.util.Scanner;
public class ø3_oppgave1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Utskrift av multiplikasjonstabellen:");
		System.out.println("---");
        System.out.print("Skriv inn starttall: ");
        int start_tall = reader.nextInt();
        int slutt_tall = 0;

        while (slutt_tall<=start_tall){
            System.out.print("Skriv inn sluttall: (må være mer enn start_tall) ");
            slutt_tall = reader.nextInt();
            if (slutt_tall<=start_tall) {
                System.out.println(" er mindre enn ");
            }
        }
        System.out.println("Skriv antall regnestykker per tabell");
        int antallStykker=reader.nextInt();
        for (int i = start_tall; i<=slutt_tall; i++){
            System.out.println("Tabell " + i);
            for (int j = 1; j<=antallStykker; j++) {
                System.out.println(i +" * "+j+" = " +(i*j));
            }
            System.out.println("---");
        }
    }
    
}
