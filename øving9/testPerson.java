package øving9;

public class testPerson {
    public static void main(String[] args) {
        Student student1 = new Student("Robert Åsberg");
        Student student2 = new Student("Erlend Einertsen Tveter");
        
        System.out.println(student1.getEtternavnFornavn());
        System.out.println(student1.toString());
        System.out.println(student2.getEtternavnFornavn());
        System.out.println(student2.toString());

        for (int i = 0; i < 10; i++) {
            student1.økAntOppg(1);
            student2.økAntOppg(1);
            System.out.println(student1.toString());
            System.out.println(student2.toString());
            System.out.println(" ");
        }


    }
}
