import java.util.Locale;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int c = sc.nextInt();

            int[][] mat = lerMatriz(sc, l, c);

            int r = sc.nextInt();
            int s = sc.nextInt();

            if (l * c != r * s) {
                System.out.println("reorganizacao impossivel");
                return;
            }

            int[][] novaMatriz = reorganizarMatriz(mat, r, s);

            System.out.println("Matriz reorganizada: ");

            for (int i = 0; i < novaMatriz.length; i++) {
                for (int j = 0; j < novaMatriz[i].length; j++) {
                    System.out.print(novaMatriz[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] lerMatriz(Scanner sc, int l, int c) {
        int[][] mat = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        return mat;
    }

    public static int[][] reorganizarMatriz(int[][] mat, int r, int s) {
        int[][] novaMatriz = new int[r][s];
        int k = 0;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                int linhaOriginal = k / c;
                int colunaOriginal = k % c;

                novaMatriz[i][j] = mat[linhaOriginal][colunaOriginal];
                k++;
            }
        }

        return novaMatriz;
    }
}
