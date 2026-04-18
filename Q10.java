import java.util.Locale;
import java.util.Scanner;

public class Q10 {
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

        int maiorSomaLinha = Integer.MIN_VALUE;
        int indiceL = 0;

        for (int i = 0; i < mat.length; i++) {
            int soma = 0;

            for (int j = 0; j < mat[i].length; j++) {
                soma += mat[i][j];
            }

            System.out.println("Soma da linha " + i + ": " + soma);

            if (soma > maiorSomaLinha) {
                maiorSomaLinha = soma;
                indiceL = i;
            }
        }

        int maiorSomaColuna = Integer.MIN_VALUE;
        int indiceC = 0;

        for (int j = 0; j < mat[0].length; j++) {
            int soma = 0;

            for (int i = 0; i < mat.length; i++) {
                soma += mat[i][j];
            }

            System.out.println("Soma da coluna " + j + ": " + soma);

            if (soma > maiorSomaColuna) {
                maiorSomaColuna = soma;
                indiceC = j;
            }
        }

        System.out.println("Linha com maior soma: " + indiceL);
        System.out.println("Coluna com maior soma: " + indiceC);

        sc.close();
    }
}