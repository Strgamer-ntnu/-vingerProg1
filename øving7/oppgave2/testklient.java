package øving7.oppgave2;

public class testklient {
    public static void main(String[] args) {
        tekstbehandling test = new tekstbehandling("I am not a god. I am more than that. Infinitely more. I am everything. This world, this ARK, it is my body. I can feel every bit of it, every footstep of man or beast that falls upon my skin, and every root that digs into my flesh. They are all mine. Everything in this world happens only by my will. Yet should anyone else challenge me, they shall receive no mercy. My wrath will be swift and terrible, and my enemies will know only pain. I am everything.");
        
        System.out.println(test.getTekst());
        System.out.println("\nAntall ord: "+test.getAntallOrd());
        System.out.println("Gjennomsnittlig ordlengde: "+test.getGjennomsnittligOrdLengde());
        System.out.println("Gjennomsnittlig antall ord per periode: "+test.getGjennomsnittligAntallOrdPerPeriode());
        System.out.println("\n"+test.getTekstMedStoreBokstaver());
        System.out.println("\nTekst med ord byttet ut ord: "+test.getTekstMedByttetOrd(" my ", " your "));

        
    
    
    }


}
