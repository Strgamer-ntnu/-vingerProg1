package øving6.oppgave3;

public class Matrise {
    
    private int[][] matrise;
    private int antallRader;
    private int antallKolonner;

    public Matrise(int[][] matrise) {
        this.matrise = matrise;
        this.antallRader = matrise.length;
        this.antallKolonner = matrise[0].length;

        //checks if all rows are the same length
        for (int i = 0; i < antallRader; i++) {
            if (matrise[i].length != antallKolonner) {
                throw new IllegalArgumentException("Not all rows are the same length");
            }
        }

    }
    public int[][] getMatrise() {
        return matrise;
    }
    public int getAntallRader() {
        return antallRader;
    }
    public int getAntallKolonner() {
        return antallKolonner;
    }
    public int[][] adderMatrise(Matrise matrise2) {
        if (matrise2.getAntallRader() != antallRader || matrise2.getAntallKolonner() != antallKolonner) {
            System.out.println("Matrisene må være like store");
            return null;
        }
        int[][] matrise3 = new int[antallRader][antallKolonner];
        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                matrise3[i][j] = matrise[i][j] + matrise2.getMatrise()[i][j];
            }
        }
        return matrise3;
    }

    public int[][] multipliserMatrise(Matrise matrise2) {
        if (matrise2.getAntallRader() != antallKolonner) {
            System.out.println("Antall kolonner i matrise 1 må være lik antall rader i matrise 2");
            return null;
        }
        int[][] matrise3 = new int[antallRader][matrise2.getAntallKolonner()];
        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < matrise2.getAntallKolonner(); j++) {
                for (int k = 0; k < antallKolonner; k++) {
                    matrise3[i][j] += matrise[i][k] * matrise2.getMatrise()[k][j];
                }
            }
        }
        return matrise3;
    }
    public int[][] transponerMatrise() {
        int[][] matrise3 = new int[antallKolonner][antallRader];
        for (int i = 0; i < antallRader; i++) {
            for (int j = 0; j < antallKolonner; j++) {
                matrise3[j][i] = matrise[i][j];
            }
        }
        return matrise3;
    }
}
