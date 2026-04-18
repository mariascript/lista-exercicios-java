import java.util.Locale;
import java.util.Scanner;

public class Q16 {
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

        int[] saidas = new int[n];
        int[] chegadas = new int[n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                saidas[i] += matriz[i][j];
                chegadas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Saidas do terminal " + i + ": " + saidas[i]);
        }

        for (int j = 0; j < n; j++) {
            System.out.println("Chegadas no terminal " + j + ": " + chegadas[j]);
        }

        int maiorDif = Math.abs(saidas[0] - chegadas[0]);
        int indice = 0;

        for (int i = 1; i < n; i++) {
            int dif = Math.abs(saidas[i] - chegadas[i]);

            if (dif > maiorDif) {
                maiorDif = dif;
                indice = i;
            }
        }

        boolean simetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        System.out.println("Terminal com maior diferenca absoluta entre saidas e chegadas: " + indice);

        if (simetrica) {
            System.out.println("Matriz simetrica: sim");
        } else {
            System.out.println("Matriz simetrica: nao");
        }

        sc.close();
    }
}