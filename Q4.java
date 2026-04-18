import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] codigosP = new int[n];

        for (int i = 0; i < codigosP.length; i++) {
            codigosP[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < codigosP.length; i++) {
            if (codigosP[i] == x) {
                encontrado = true;
                posicao = i;
                break;
            }
        }

        if (encontrado) {
            System.out.println("codigo encontrado");
            System.out.println("primeira posicao: " + posicao);
        } else {
            System.out.println("codigo nao encontrado");
        }

        sc.close();
    }
}