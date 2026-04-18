import java.util.Locale;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        int somaTotal = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        int soma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[0][j];
        }

        int maiorSomaLinha = soma;
        int indiceLinha = 0;

        for (int i = 1; i < matriz.length; i++) {
            soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            if (soma > maiorSomaLinha) {
                maiorSomaLinha = soma;
                indiceLinha = i;
            }
        }

        soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][0];
        }

        int menorSomaColuna = soma;
        int indiceColuna = 0;

        for (int j = 1; j < matriz[0].length; j++) {
            soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }

            if (soma < menorSomaColuna) {
                menorSomaColuna = soma;
                indiceColuna = j;
            }
        }

        double media = (double) somaTotal / (l * c);

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    contador++;
                }
            }
        }

        System.out.println("linha com maior soma: " + indiceLinha);
        System.out.println("coluna com menor soma: " + indiceColuna);
        System.out.printf("media geral: %.2f\n", media);
        System.out.println("quantidade acima da media: " + contador);

        sc.close();
    }
}