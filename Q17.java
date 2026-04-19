import java.util.Locale;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int c = sc.nextInt();

            int[][] matriz = lerMatriz(sc, l, c);

            int[] resultadosLinha = maiorSomaLinha(matriz);
            int[] resultadoColuna = maiorSomaColuna(matriz);

            System.out.println("maior soma contigua em linha: " + resultadosLinha[0]);
            System.out.println("linha da maior soma: " + resultadoLinha[1]);
            System.out.println();
            System.out.println("maior soma contigua em coluna: " + resultadoColuna[0]);
            System.out.println("coluna da maior soma: " + resultadoColuna[1]);
        }
    }

    public static int[][] lerMatriz(Scanner sc, int l, int c) {
        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public static int[] maiorSomaLinha(int[][] matriz) {
        int maiorLinha = matriz[0][0];
        int indiceLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            int somaAtual = matriz[i][0];
            int melhor = matriz[i][0];

            for (int j = 1; j < matriz[i].length; j++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                melhor = Math.max(melhor, somaAtual);
            }

            if (melhor > maiorLinha) {
                maiorLinha = melhor;
                indiceLinha = i;
            }
        }

        return new int[]{maiorLinha, indiceLinha};
    }

    public static int[] maiorSomaColuna(int[][] matriz) {
        int maiorColuna = matriz[0][0];
        int indiceColuna = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            int somaAtual = matriz[0][j];
            int melhor = matriz[0][j];

            for (int i = 1; i < matriz.length; i++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                melhor = Math.max(melhor, somaAtual);
            }

            if (melhor > maiorColuna) {
                maiorColuna = melhor;
                indiceColuna = j;
            }
        }

        return new int[]{maiorColuna, indiceColuna};
    }
}
