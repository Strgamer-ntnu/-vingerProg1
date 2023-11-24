// -*- coding: utf-8 -*-
package øving6.oppgave2;

import java.util.List;
import java.util.Scanner;

public class ø6_oppgave2_takstanalyse_klinet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Skriv inn en tekst:");
        System.out.println("(skriv avslutt for å avslutte)");
        String tekst = scanner.nextLine();
        Tekstanalyse tekstAnalyse = new Tekstanalyse();
        while (tekst.toString().equals("avslutt")==false) {


            System.out.println("\n");
            tekstAnalyse.setTekst(tekst);
            
            int forskjelligeBokstaver = tekstAnalyse.getForskjelligeBokstaver();
            System.out.println("Antall forskjellige bokstaver: " + forskjelligeBokstaver);

            int antallBokstaver = tekstAnalyse.getAntallBokstaver();
            System.out.println("Antall bokstaver: " + antallBokstaver);
            
            double prosentIkkeBokstaver = tekstAnalyse.getProsentIkkeBokstaver();
            System.out.println("Prosent ikke bokstaver: " + prosentIkkeBokstaver);
            
            System.out.println("Skriv inn en bokstav:");
            char bokstav = scanner.next().charAt(0);
            int antallForekomster = tekstAnalyse.getAntallAvBokstav(bokstav);
            System.out.println("Antall forekomster av " + bokstav + ": " + antallForekomster);
            
            List<Character> vanligsteBokstaver = tekstAnalyse.getBokstaverSomForekommerOftest();
            System.out.println("Vanligste bokstaver: " + vanligsteBokstaver);
            
            System.out.println("(skriv avslutt for å avslutte) Skriv inn en tekst:");
            scanner.nextLine();  
            tekst = scanner.nextLine();
            tekst = tekst.toLowerCase(); 
        
        }
    }
}
