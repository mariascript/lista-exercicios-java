import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        int[][] matriz = new int[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        lerMatriz (matriz, l, c);

        sc.close();
    }

    public static void lerMatriz(int[][] matriz, int l, int c) {
        int maiorSoma = Integer.MIN_VALUE;

        for (int i = 0; i < l; i++) {
            int somaLinha = 0;

            for (int j = 0; j < c; j++) {
                somaLinha += matriz[i][j];
            }

            System.out.println("soma da linha " + i + ": " + somaLinha);

            if (somaLinha > maiorSoma) {
                maiorSoma = somaLinha;
            }
        }

        System.out.println("maior soma: " + maiorSoma);
    }
}
