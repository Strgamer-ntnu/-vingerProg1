package øving6.oppgave3;

public class ø6_oppgave3_klient {
    public static void main(String[] args) {
        Matrise matrise_A = new Matrise(lagTilfeldigMatrise(3, 3));
        Matrise matrise_B = new Matrise(lagTilfeldigMatrise(3, 3));

        System.out.println("Matrise A:");
        int[][] matrix = (int[][]) matrise_A.getMatrise();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        System.out.println("\nMatrise B:");
        int[][] matrix1 = (int[][]) matrise_B.getMatrise();
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
        
        System.out.println("\nMatrise A + Matrise B:");
        int[][] matrix2 = (int[][]) matrise_A.adderMatrise(matrise_B);
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        System.out.println("\nMatrise A * Matrise B:");
        int[][] matrix3 = (int[][]) matrise_A.multipliserMatrise(matrise_B);
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        System.out.println("\nMatrise A transponert:");
        int[][] matrix4 = (int[][]) matrise_A.transponerMatrise();
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }


    }
    public static int[][] lagTilfeldigMatrise(int n, int m){
        int[][] matrise = new int[n][m];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                matrise[i][j] = (int)(Math.random()*10);
            }
        }
        return matrise;
    }
}
