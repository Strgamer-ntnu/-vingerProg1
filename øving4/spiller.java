package øving4;
import java.util.Random;
public class spiller {
    
    private int poeng;
    private boolean avansert = false;

    public void kastTerning() {
        Random terning= new java.util.Random();
        int resultat = terning.nextInt(6)+1;
        if (resultat == 1) {
            poeng = 0;
        } else if (resultat + poeng<=100 || avansert==false){
            poeng += resultat;
        }
        else{
            poeng -= resultat;    
        }
        if (poeng > 100) {
            erFerdig();
        }
    }
    public int getPoeng() {
        return poeng;
    }
    public void erFerdig() {
        System.out.println("Spilleren har vunnet");
        
    }
    public void setAvansert(boolean avansert) {
        this.avansert = avansert;
    }

}
