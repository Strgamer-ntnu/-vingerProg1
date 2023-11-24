package øving9;

public class Student {
    private String navn; 
    private int antOppg;

    public Student(String navn) {
        this.navn = navn;
        this.antOppg = 0;
    }
    public String getNavn() {
        return navn;
    }
    public int getAntOppg() {
        return antOppg;
    }
    public void økAntOppg(int økning) {
        this.antOppg += økning;
    }
    public String toString() {
        return getEtternavnFornavn() + "   \t| Oppgaver: " + antOppg + ";";
    }
    public String getEtternavnFornavn(){
        String[] newNavn = this.navn.split(" ");
        String etternavn = newNavn[newNavn.length-1];
        String fornavn = navn.replace(etternavn, "");
        return etternavn + ", " +fornavn ;
    }

}
