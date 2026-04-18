import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int somaRef = 0;
        for (int j = 0; j < matriz[0].length; j++) {
            somaRef += matriz[0][j];
        }

        int diferenca = 0;

        for (int i = 1; i < matriz.length; i++) {
            int soma = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
            if (soma != somaRef) {
                diferenca++;
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            int soma = 0;
            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }
            if (soma != somaRef) {
                diferenca++;
            }
        }

        if (diferenca == 0) {
            System.out.println("Matriz consistente: sim");
            System.out.println("Valor comum das somas: " + somaRef);
            sc.close();
            return;
        }

        System.out.println("Matriz consistente: nao");
        System.out.println("Quantidade de estruturas com soma diferente da primeira linha: " + diferenca);

        sc.close();
    }
}