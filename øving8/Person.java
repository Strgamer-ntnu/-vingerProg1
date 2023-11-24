package øving8;

public class Person {
    private final String fornavn;
    private final String etternavn;
    private final int fødselsår;

    public Person(String fornavn, String etternavn, int fødselsår) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.fødselsår = fødselsår;
    }
    public Person() {
        this.fornavn = "Ola";
        this.etternavn = "Lie";
        this.fødselsår = 1952;
    }
    public String getFornavn() {
        return fornavn;
    }
    public String getEtternavn() {
        return etternavn;
    }
    public int getFødselsår() {
        return fødselsår;
    }
    

}
