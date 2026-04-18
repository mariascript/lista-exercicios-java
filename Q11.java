import java.util.Locale;
import java.util.Scanner;

public class Q11 {
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

        System.out.println("Matriz transposta:");

        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}