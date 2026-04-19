import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[][] matriz = lerMatriz(sc, n);

            int somaRef = somaLinha(matriz, 0);
            int diferenca = contarDiferencas(matriz, somaRef);

            if (diferenca == 0) {
                System.out.println("Matriz consistente: sim");
                System.out.println("Valor comum das somas: " + somaRef);
            } else {
                System.out.println("Matriz consistente: nao");
                System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferenca);
            }
        }
    }

    public static int[][] lerMatriz(Scanner sc, int n) {
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        return matriz;
    }

    public static int somaLinha(int[][] matriz, int linha) {
        int soma = 0;

        for (int j = 0; j < matriz[linha].length; j++) {
            soma += matriz[linha][j];
        }

        return soma;
    }

    public static int somaColuna(int[][] matriz, int coluna) {
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][coluna];
        }

        return soma;
    }

    public static int contarDiferencas(int[][] matriz, int somaRef) {
        int diferenca = 0;

        for (int i = 1; i < matriz.length; i++) {
            if (somaLinha(matriz, i) != somaRef) {
                diferenca++;
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            if (somaColuna(matriz, j) != somaRef) {
                diferenca++;
            }
        }

        return diferenca;
    }
}
