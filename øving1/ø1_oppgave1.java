import java.util.Scanner;
public class ø1_oppgave1{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Skriv inn tommer: ");

        float tommer = reader.nextFloat();
        float centimeter = tommer * 2.54f;
        System.out.println(tommer + " tommer er "+centimeter + " centimeter");
        
    }
}