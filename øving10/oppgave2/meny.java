package øving10.oppgave2;

public class meny {
    private String navn;
    private rett[] retter = new rett[3];
    private int totalPris;
    public meny(String navn, rett[] retter) {
        this.navn = navn;
        this.retter = retter;
        for (rett rett : retter) {
            totalPris += rett.getPris();
        }
    }
    public String getNavn() {
        return navn;
    }
    public rett[] getRetter() {
        return retter;
    }
    public int getTotalPris() {
        return totalPris;
    }
    public String toString() {
        String rettString = "";
        for (rett rett : retter) {
            rettString += rett.getNavn() + ", ";
        }
        return "Navn: " + navn + "\nRetter: " + rettString + "\nTotal pris: " + totalPris + "\n";
    }
    public boolean getTotalPrisIIntervall(int startPris, int sluttPris) {
        return totalPris >= startPris && totalPris <= sluttPris;
    }
    public String toString() {
        return "Navn: " + navn + "\nRetter: " + retter + "\nTotal pris: " + totalPris + "\n";
    }
}
