import java.util.Locale;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            
            int n = sc.nextInt();

            int[][] distancias = lerMatriz(sc, n);

            if (diagonalPrincipalZerada(distancias)) {
                System.out.println("Diagonal principal com zeros: sim");
            } else {
                System.out.println("Diagonal principal com zeros: nao");
            }

            int[] posicao = maiorForaDiagonal(distancias);
            int i = posicao[0];
            int j = posicao[1];

            System.out.printf("Maior valor fora da diagonal: %d (%d,%d)%n",
                    distancias[i][j], i, j);

            int indiceLinha = linhaMenorSoma(distancias);
            System.out.printf("Linha com menor soma: %d%n", indiceLinha);
        }
    }

    public static int[][] lerMatriz(Scanner sc, int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public static boolean diagonalPrincipalZerada(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] maiorForaDiagonal(int[][] matriz) {
        int maiorValor = Integer.MIN_VALUE;
        int linhaMax = 0;
        int colunaMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j && matriz[i][j] > maiorValor) {
                    maiorValor = matriz[i][j];
                    linhaMax = i;
                    colunaMax = j;
                }
            }
        }

        return new int[]{linhaMax, colunaMax};
    }

    public static int linhaMenorSoma(int[][] matriz) {
        int menorSoma = Integer.MAX_VALUE;
        int indiceLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            if (soma < menorSoma) {
                menorSoma = soma;
                indiceLinha = i;
            }
        }

        return indiceLinha;
    }
}
