package øving7.oppgave1;

public class test_nystring {
    public static void main(String[] args) {
        NyString test = new NyString("Du er en soppgomler som hører til det tredje riket");
        System.out.println(test.getForkortelse());
        System.out.println(test.fjernTegn('e'));
    }
}
