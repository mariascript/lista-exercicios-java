import java.util.Locale;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int c = sc.nextInt();

            int[][] matriz = lerMatriz(sc, l, c);

            double media = calcularMedia(matriz);

            System.out.println("linha com maior soma: " + linhaMaiorSoma(matriz));
            System.out.println("coluna com menor soma: " + colunaMenorSoma(matriz));
            System.out.printf("media geral: %.2f%n", media);
            System.out.println("quantidade acima da media: " + quanntidadeAcimaDaMedia(matriz, media));
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

    public static int linhaMaiorSoma(int[][] matriz) {
        int maiorSoma = Integer.MIN_VALUE;
        int indiceLinha = 0;

        for (int i = 0; i < matriz.length; i++) {
            int soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            if (soma > maiorSoma) {
                maiorSoma = soma;
                indiceLinha = i;
            }
        }

        return indiceLinha;
    }

    public static int colunaMenorSoma(int[][] matriz) {
        int menorSoma = Integer.MAX_VALUE;
        int indiceColuna = 0;

        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }

            if (soma < menorSoma) {
                menorSoma = soma;
                indiceColuna = j;
            }
        }

        return indiceColuna;
    }

    public static double calcularMedia(int[][] matriz) {
        int somaTotal = 0;
        int total = matriz.length * matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
            }
        }

        return (double) somaTotal / total;
    }

    public static int quantidadeAcimaDaMedia(int[][] matriz, double media) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > media) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
