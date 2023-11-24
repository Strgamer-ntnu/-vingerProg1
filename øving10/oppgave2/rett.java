package øving10.oppgave2;

public class rett {
    private String navn;
    private String oppskrift;
    private int pris;
    private typerRetter type;
    
    public rett(String navn, String oppskrift, int pris, typerRetter type) {
        this.navn = navn;
        this.oppskrift = oppskrift;
        this.pris = pris;
        this.type = type;
    }
    public String getNavn() {
        return navn;
    }
    public String getOppskrift() {
        return oppskrift;
    }
    public int getPris() {
        return pris;
    }
    public boolean getRettIsType(typerRetter type) {
        return this.type == type;
    }
    public String toString() {
        return "Navn: " + navn + "\nPris: " + pris + "; Type: " + type + "\n";
    }
    
}
