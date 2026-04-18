import java.util.Locale;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int maiorLinha = matriz[0][0];
        int indiceSomaL = 0;

        for (int i = 0; i < l; i++) {
            int somaAtual = matriz[i][0];
            int melhor = matriz[i][0];

            for (int j = 1; j < c; j++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                melhor = Math.max(melhor, somaAtual);
            }

            if (melhor > maiorLinha) {
                maiorLinha = melhor;
                indiceSomaL = i;
            }
        }

        int maiorColuna = matriz[0][0];
        int indiceColuna = 0;

        for (int j = 0; j < c; j++) {
            int somaAtual = matriz[0][j];
            int melhor = matriz[0][j];

            for (int i = 1; i < l; i++) {
                somaAtual = Math.max(matriz[i][j], somaAtual + matriz[i][j]);
                melhor = Math.max(melhor, somaAtual);
            }

            if (melhor > maiorColuna) {
                maiorColuna = melhor;
                indiceColuna = j;
            }
        }

        System.out.println("Maior soma contigua em linha: " + maiorLinha);
        System.out.println("Linha da maior soma: " + indiceSomaL);
        System.out.println("");
        System.out.println("Maior soma contigua em coluna: " + maiorColuna);
        System.out.println("Coluna da maior soma: " + indiceColuna);

        sc.close();
    }
}