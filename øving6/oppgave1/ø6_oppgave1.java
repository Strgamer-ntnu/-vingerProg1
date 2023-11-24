package øving6.oppgave1;
import java.util.Random;
public class ø6_oppgave1 {
    public static void main(String[] args) {
        int[] antall_tall ={0,0,0,0,0,0,0,0,0,0};
        Random random = new Random();
        double temp = 0;
        int loops=1000;
        for (int i = 0; i < loops; i++) {
            antall_tall[random.nextInt(10)]+=1;
        }
        for (int i = 0; i < antall_tall.length; i++) {
            temp = (antall_tall[i]);
            temp/=(loops/100);
            System.out.println(i+":\t"+antall_tall[i]+"\t"+"*".repeat((int)Math.round(temp)));
        }
        
    }
}
