import java.util.Locale;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            int l = sc.nextInt();
            int c = sc.nextInt();

            int[][] matriz = new int[l][c];

            for (int i = 0; i < l; i++) {
                for (int j = 0; j < c; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            int[] somaLinhas = somaLinhas(matriz);
            int[] somaColunas = somaColunas(matriz);

            for (int i = 0; i < somaLinhas.length; i++) {
                System.out.println("soma da linha " + i + ": " + somaLinhas[i]);
            }

            for (int j = 0; j < somaColunas.length; j++) {
                System.out.println("soma da coluna " + j + ": " + somaColunas[j]);
            }

            System.out.println("linha com maior soma: " + maiorIndice(somaLinhas));
            System.out.println("coluna com maior soma: " + maiorIndice(somaColunas));
        }
    }

    public static int[] somaLinhas(int[][] matriz) {
        int[] somas = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somas[i] += matriz[i][j];
            }
        }

        return somas;
    }

    public static int[] somaColunas(int[][] matriz) {
        int[] somas = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                somas[j] += matriz[i][j];
            }
        }

        return somas;
    }
    
    public static int maiorIndice(int[] vetor) {
    int maior = vetor[0];
    int indice = 0;

    for (int i = 1; i < vetor.length; i++) {
        if (vetor[i] > maior) {
            maior = vetor[i];
            indice = i;
        }
    }

    return indice;
        
    }
}
