import java.util.Scanner;
import java.util.Locale;

public class Q9 {

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

        System.out.println("soma da diagonal principal: " + somaPrincipal(matriz));
        System.out.println("soma da diagonal secundaria: " + somaSecundaria(matriz));
        System.out.println("soma total das diagonais sem repetir o centro: " + somaTotalSemRepetir(matriz));

        sc.close();
    }

    public static int somaPrincipal(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }

    public static int somaSecundaria(int[][] matriz) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][matriz.length - 1 - i];
        }
        return soma;
    }
    
    public static int somaTotalSemRepetir(int[][] matriz) {
        int soma = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
            
            if (i != matriz.length - 1 - i) {
                soma += matriz[i][matriz.length - 1 - i];
            }
        }
        return soma;
    }
}
