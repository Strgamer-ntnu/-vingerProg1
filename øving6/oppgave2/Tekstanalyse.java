// -*- coding: utf-8 -*-
package øving6.oppgave2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tekstanalyse {
    
    private String tekst;
    List antall_tegn;

    
    public void setTekst(String inputTekst) {
        this.tekst = inputTekst.toLowerCase();
        List antall_tegn = new ArrayList<>();
        for (int i = 0; i <= 29; i++) {
            antall_tegn.add(0);
        }
        char a = 0;

        int antallBokstaver = tekst.length();
        for (int i=0; i<antallBokstaver; i++){
            a = tekst.charAt(i);
            if (a>=97 && a<=122){
                antall_tegn.set(a-97, (int)antall_tegn.get(a-97)+1);
            }
            else if (a==230) {
                antall_tegn.set(26, (int)antall_tegn.get(26)+1);
            }
            else if (a==248) {
                antall_tegn.set(27, (int)antall_tegn.get(27)+1);
            }
            else if (a==229) {
                antall_tegn.set(28, (int)antall_tegn.get(28)+1);
            }
            else {
                antall_tegn.set(29, (int)antall_tegn.get(29)+1);
            }
        }
 
        this.antall_tegn = antall_tegn;
    }

    public int getForskjelligeBokstaver() {
        int antall = 0;
        for (int i = 0; i < antall_tegn.size()-1; i++) {
            if ((int)antall_tegn.get(i)>0) {
                antall++;
            }
        }
        return antall;
    }
    public int getAntallBokstaver() {
        int antall = 0;
        for (int i = 0; i < antall_tegn.size()-1; i++) {
            antall+=(int)antall_tegn.get(i);
        }
        return antall;
    }
    public double getProsentIkkeBokstaver() {
        float antall = 0;
        for (int i = 0; i < antall_tegn.size()-1; i++) {
            antall+=(int)antall_tegn.get(i);
        }
        float antall_ikkeBokstaver = (int)antall_tegn.get(29);
        double prosent = antall_ikkeBokstaver/(antall+antall_ikkeBokstaver)*100;
        return prosent;
    }
    public int getAntallAvBokstav(char bokstav) {
        int antall = 0;
        if (bokstav>=65 && bokstav<=90){
            antall = (int)antall_tegn.get(bokstav-65);
        }
        else if (bokstav>=97 && bokstav<=122){
            antall = (int)antall_tegn.get(bokstav-97);
        }
        else if (bokstav==230 || bokstav==198){
            antall = (int)antall_tegn.get(26);
        }
        else if (bokstav==248 || bokstav==216){
            antall = (int)antall_tegn.get(27);
        }
        else if (bokstav==229 || bokstav==197){
            antall = (int)antall_tegn.get(28);
        }
        else {
            antall = (int)antall_tegn.get(29);
        }
        return antall;
    }
    public List<Character> getBokstaverSomForekommerOftest() {
        List<Character> bokstaver = new ArrayList<>();
        int størstAntall = 0;
        for (int i = 0; i < antall_tegn.size()-1; i++) {
            if ((int)antall_tegn.get(i)>størstAntall) {
                størstAntall = (int)antall_tegn.get(i);
            }
        }
        for (int i = 0; i < antall_tegn.size()-1; i++) {
            if ((int)antall_tegn.get(i)==størstAntall) {
                bokstaver.add((char)(i+65));
            }
        }
        return bokstaver;
    }
}
