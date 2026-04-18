import java.util.Locale;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();
        int s = sc.nextInt();

        if (l * c != r * s) {
            System.out.println("Reorganizacao impossivel");
            sc.close();
            return;
        }

        System.out.println("Matriz reorganizada:");

        int k = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {

                int linhaOriginal = k / c;
                int colunaOriginal = k % c;

                System.out.print(mat[linhaOriginal][colunaOriginal] + " ");

                k++;
            }
            System.out.println();
        }

        sc.close();
    }
}