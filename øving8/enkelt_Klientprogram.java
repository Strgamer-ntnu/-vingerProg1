package øving8;

public class enkelt_Klientprogram {
    public static void main(String[] args) {
        Person person1 = new Person("Robert", "Åsberg", 1902);
        Person person2 = new Person();
        System.out.println(person1.getFornavn());
        System.out.println(person2.getFornavn());

        ArbTaker arbTaker = new ArbTaker(person1, 123456789, 1941, 43000f, 0.5f);
        System.out.println("Navn: "+arbTaker.getFullNavnFancy());

        System.out.println("Alder: "+arbTaker.getAlder());
        System.out.println("Ansettelsesår:"+arbTaker.getAnsettelsesår());
        System.out.println("Månedslønn: "+arbTaker.getMånedslønn());
        System.out.println("Skatt per måned:"+arbTaker.skattPerMåned());
        System.out.println("Bruttolønn per år: "+ arbTaker.bruttoLønnPerÅr());
        System.out.println("Skatt per år: "+arbTaker.skattPerÅr());
        System.out.println("Antall år ansatt: "+arbTaker.getAntallÅrAnsatt());
        System.out.println("Er ansatt lenger enn 10 år = "+arbTaker.ansattLengerEnn(10));


    }   
}
