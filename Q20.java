import java.util.Scanner;

public class Q20 {
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

        int k = sc.nextInt();

        int maiorComprimento = 0;
        int linhaSeq = -1;
        int indiceInicial = -1;
        int indiceFinal = -1;

        for (int i = 0; i < l; i++) {
            int comprimento = 0;
            int inicio = 0;

            for (int j = 0; j < c; j++) {

                if (matriz[i][j] > k) {
                    if (comprimento == 0) {
                        inicio = j;
                    }
                    comprimento++;
                } else {
                    if (comprimento > maiorComprimento) {
                        maiorComprimento = comprimento;
                        linhaSeq = i;
                        indiceInicial = inicio;
                        indiceFinal = j - 1;
                    }
                    comprimento = 0;
                }
            }

            if (comprimento > maiorComprimento) {
                maiorComprimento = comprimento;
                linhaSeq = i;
                indiceInicial = inicio;
                indiceFinal = c - 1;
            }
        }

        System.out.println("Maior sequencia acima de " + k + ": " + maiorComprimento);
        System.out.println("Linha da sequencia: " + linhaSeq);
        System.out.println("Indice inicial: " + indiceInicial);
        System.out.println("Indice final: " + indiceFinal);

        sc.close();
    }
}