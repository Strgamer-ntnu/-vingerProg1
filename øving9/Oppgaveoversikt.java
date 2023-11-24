package øving9;

import java.util.ArrayList;
import java.util.Scanner;

public class Oppgaveoversikt {

    private ArrayList<Student> studenter = new ArrayList<Student>();

    private int antStud = 0;

    public Oppgaveoversikt() {
        
        studenter.add(new Student("Kalle Kontainer"));
        studenter.add(new Student("Kåre Kakkelovn"));
        studenter.add(new Student("Erlend Einertsen Tveter"));
        studenter.add(new Student("Ola Lie"));
        studenter.add(new Student("Morten Dramstad"));
        studenter.add(new Student("Pelle Prokrast"));
        studenter.add(new Student("Sebastian Graves"));
        studenter.add(new Student("Jonathan Tapp"));
        studenter.add(new Student("Robert Åsberg"));
        antStud = studenter.size();

    }
    public int antallStudenter(){
        return antStud;
    }
    public void registrerStudent(Student student){
        studenter.add(student);
        antStud++;
    }
    public int finnAntOppgaver(String navn){
        for (int i = 0; i < studenter.size(); i++) {
            if (studenter.get(i).getNavn().equals(navn)) {
                return studenter.get(i).getAntOppg();
            }
        }
        System.out.println("Studenten finnes ikke");
        System.out.println("Skriv inn navn på nytt ");
        Scanner reader = new Scanner(System.in);
        return finnAntOppgaver(reader.nextLine());
    }
    public void økAntOppg(String navn, int økning){
        for (int i = 0; i < studenter.size(); i++) {
            if (studenter.get(i).getNavn().equals(navn)) {
                studenter.get(i).økAntOppg(økning);
                return;
            }
        }
        System.out.println("Studenten finnes ikke");
        System.out.println("Skriv inn navn på nytt ");
        Scanner reader = new Scanner(System.in);
        økAntOppg(reader.nextLine(), økning);
    }
    public String toString() {
        String output = "";
        for (int i = 0; i < studenter.size(); i++) {
            output += studenter.get(i).toString() + "\n";
        }
        return output;
    }
    public String getStudenterString() {
        String output = "";
        for (int i = 0; i < studenter.size(); i++) {
            output += studenter.get(i).getNavn() + "\n";
        }
        return output;
    }
}
