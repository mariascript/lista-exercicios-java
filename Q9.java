import java.util.Scanner;
import java.util.Locale;

public class Q9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaPrincipal = 0;
        int somaSecundaria = 0;
        int somaTotalSemRepetir = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    somaPrincipal += matriz[i][j];
                    somaTotalSemRepetir += matriz[i][j];
                }

                if (i + j == n - 1) {
                    somaSecundaria += matriz[i][j];

                    if (i != j) {
                        somaTotalSemRepetir += matriz[i][j];
                    }
                }
            }
        }

        System.out.println("soma da diagonal principal: " + somaPrincipal);
        System.out.println("soma da diagonal secundaria: " + somaSecundaria);
        System.out.println("soma total das diagonais sem repetir o centro: " + somaTotalSemRepetir);

        sc.close();
    }
}