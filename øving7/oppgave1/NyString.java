package øving7.oppgave1;

public class NyString {
    private String string;

    public NyString(String arg) {
        this.string = arg;
    }
    public String getString() {
        return string;
    }
    public String getForkortelse() {
        String[] ord = string.split(" ");
        String forkortelse = "";
        for (String s : ord) {
            forkortelse += s.charAt(0);
        }
        return forkortelse;
    }
    public String fjernTegn(char tegn) {
        String nyString = "";
        while (string.indexOf(tegn) != -1) {
            nyString += string.substring(0, string.indexOf(tegn));
            string = string.substring(string.indexOf(tegn)+1);
        }
        return nyString;
    }
}
