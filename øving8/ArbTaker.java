package øving8;

public class ArbTaker {
    private Person person;
    private int arbtakernr;
    private int ansettelsesår;
    private float månedslønn;
    private float skatteprosent;
    java.util.GregorianCalendar kalender = new java.util.GregorianCalendar();

    public ArbTaker(Person person, int arbtakernr, int ansettelsesår, float månedslønn, float skatteprosent) {
        this.person = person;
        this.arbtakernr = arbtakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }
    public Person getPerson() {
        return person;
    }
    public int getArbtakernr() {
        return arbtakernr;
    }
    public int getAnsettelsesår() {
        return ansettelsesår;
    }
    public float getMånedslønn() {
        return månedslønn;
    }
    public float getSkatteprosent() {
        return skatteprosent;
    }
    public void setArbeiternr(int arbtakernr) {
        this.arbtakernr = arbtakernr;
    }
    public void setAnsettelsesår(int ansettelsesår) {
        if (ansettelsesår>person.getFødselsår()){
        this.ansettelsesår = ansettelsesår;
        }
        else {
            System.out.println("Ugyldig ansettelsesår");
        }

    }
    public void setMånedslønn(float månedslønn) {
        this.månedslønn = Math.abs(månedslønn);
    }
    public void setSkatteprosent(float skatteprosent) {
        this.skatteprosent = Math.abs(skatteprosent);
    }
    
    public float skattPerMåned() {
        return månedslønn*skatteprosent/100;
    }
    public float bruttoLønnPerÅr() {
        return månedslønn*12;
    }
    public float skattPerÅr() {
        return månedslønn*(12-1.5f)*skatteprosent/100;
    }
    public String getFullNavnFancy() {
        return person.getEtternavn()+", "+person.getFornavn();
    }
    public int getAlder() {
        return this.kalender.get(java.util.Calendar.YEAR)-person.getFødselsår();
    }
    public int getAntallÅrAnsatt() {
        return this.kalender.get(java.util.Calendar.YEAR)-ansettelsesår;
    }
    public boolean ansattLengerEnn(int år) {
        return getAntallÅrAnsatt()>=år;
    }

}
