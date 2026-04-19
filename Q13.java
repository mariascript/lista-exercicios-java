import java.util.Locale;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int c = sc.nextInt();

            int[][] matriz = lerMatriz(sc, l, c);

            int k = sc.nextInt();

            double media = calculoMedia(matriz);
            int maior = maiorElemento(matriz);
            int contador = contadorAcimaK(matriz, k);

            System.out.printf("Media dos elementos: %.2f%n", media);
            System.out.println("Maior elemento: " + maior);
            System.out.println("Quantidade acima de " + k + ": " + contador);
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

    public static double calculoMedia(int[][] matriz) {
        int soma = 0;
        int total = matriz.length * matriz[0].length;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return (double) soma / total;
    }

    public static int maiorElemento(int[][] matriz) {
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        return maior;
    }

    public static int contadorAcimaK(int[][] matriz, int k) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > k) {
                    contador++;
                }
            }
        }

        return contador;
    }
}
