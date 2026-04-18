import java.util.Locale;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean diagonalZero = true;

        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][i] != 0) {
                diagonalZero = false;
                break;
            }
        }

        int maior = -1;
        int linhaMaior = 0;
        int colunaMaior = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i != j) {
                    if (maior == -1 || matriz[i][j] > maior) {
                        maior = matriz[i][j];
                        linhaMaior = i;
                        colunaMaior = j;
                    }
                }
            }
        }

        int soma = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            soma += matriz[0][j];
        }

        int menorSoma = soma;
        int indiceLinha = 0;

        for (int i = 1; i < matriz.length; i++) {
            soma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }

            if (soma < menorSoma) {
                menorSoma = soma;
                indiceLinha = i;
            }
        }

        if (diagonalZero) {
            System.out.println("Diagonal principal com zeros: sim");
        } else {
            System.out.println("Diagonal principal com zeros: nao");
        }

        System.out.println("Maior valor fora da diagonal: " + maior +
                " (" + linhaMaior + "," + colunaMaior + ")");

        System.out.println("Linha com menor soma: " + indiceLinha);

        sc.close();
    }
}