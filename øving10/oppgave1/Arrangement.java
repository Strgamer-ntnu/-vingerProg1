package øving10.oppgave1;

public class Arrangement {
    private final int id;
    private String navn;
    private String sted;
    private String arrangør;
    private ArrangementType type;
    private long tidspunkt;

    public Arrangement(int id, String navn, String sted, String arrangør, ArrangementType type, long tidspunkt) {
        this.id = id;
        this.navn = navn;
        this.sted = sted;
        this.arrangør = arrangør;
        this.type = type;
        this.tidspunkt = tidspunkt;

    }
    public int getId() {
        return id;
    }
    public String getNavn() {
        return navn;
    }
    public String getSted() {
        return sted;
    }
    public boolean erVedSted(String location) {
        return sted.equals(location);
    }
    public String getArrangør() {
        return arrangør;
    }
    public ArrangementType getType() {
        return type;
    }
    public String toString() {
        return "Navn: " + navn + "; tidspunkt: "+ tidspunkt+ "\nSted: " + sted + ";    Arrangør: " + arrangør + ";    Type: " + type +"\n";
    }
    public long getTidspunkt() {
        return tidspunkt;
    }
}
