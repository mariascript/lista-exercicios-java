import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            
            int c = sc.nextInt();

            int[][] matriz = new int[l][c];

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            int[] resultado = resultadoPicos(matriz);

            System.out.println("Quantidade de pontos de pico: " + resultado[0]);

            if (resultado[0] > 0) {
                System.out.println("Posicao do maior ponto de pico: " 
                        + resultado[2] + " " + resultado[3]);
                System.out.println("Valor do maior ponto de pico: " + resultado[1]);
            }
        }
    }

    public static int[] resultadoPicos(int[][] matriz) {
        int quantidade = 0;
        int maiorPico = matriz[0][0];
        int linha = -1;
        int coluna = -1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                boolean pico = true;

                if (i > 0 && valor <= matriz[i - 1][j]) {
                    pico = false;
                }

                if (i < matriz.length - 1 && valor <= matriz[i + 1][j]) {
                    pico = false;
                }

                if (j > 0 && valor <= matriz[i][j - 1]) {
                    pico = false;
                }

                if (j < matriz[i].length - 1 && valor <= matriz[i][j + 1]) {
                    pico = false;
                }

                if (pico) {
                    quantidade++;

                    if (quantidade == 1 || valor > maiorPico) {
                        maiorPico = valor;
                        linha = i;
                        coluna = j;
                    }
                }
            }
        }

        return new int[]{quantidade, maiorPico, linha, coluna};
    }
}
