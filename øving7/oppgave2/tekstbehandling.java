package øving7.oppgave2;

public class tekstbehandling {
    private String tekst;

    public tekstbehandling(String arg) {
        this.tekst = arg;
    }
    public String getTekst() {
        return tekst;
    }
    public String getAntallOrd() {
        String[] ord = tekst.split(" ");
        return Integer.toString(ord.length);
    }
    public double getGjennomsnittligOrdLengde() {
        String[] ord = tekst.split(" ");
        double sum = 0;
        for (String s : ord) {
            sum += s.length();
        }
        return sum/ord.length;
    }
    public double getGjennomsnittligAntallOrdPerPeriode() {
        String[] perioder = tekst.split("[.!?]");
        double sum = 0;
        for (String s : perioder) {
            String[] ord = s.split(" ");
            sum += ord.length;
        }
        return sum/perioder.length;
    }
    public String getTekstMedStoreBokstaver() {
        return tekst.toUpperCase();
    }
    public String getTekstMedByttetOrd(String ord1, String ord2) {
        return tekst.replace(ord1, ord2);
    }
}
