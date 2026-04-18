import java.util.Locale;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        int soma = 0;
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();

                soma += matriz[i][j];

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        int k = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > k) {
                    contador++;
                }
            }
        }

        double media = (double) soma / (l * c);

        System.out.printf("Media dos elementos: %.2f\n", media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Quantidade acima de " + k + ": " + contador);

        sc.close();
    }
}