import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] producao = new int[n];

        for (int i = 0; i < producao.length; i++) {
            producao[i] = sc.nextInt();
        }

        int maior = producao[0];
        int menor = producao[0];
        int crescimento = 0;

        for (int i = 0; i < producao.length; i++) {

            if (producao[i] > maior) {
                maior = producao[i];
            }
            if (producao[i] < menor) {
                menor = producao[i];
            }

            if (i > 0) {
                int diferenca = producao[i] - producao[i - 1];

                if (diferenca > crescimento) {
                    crescimento = diferenca;
                }
            }
        }


        System.out.println("Maior producao: " + maior);
        System.out.println("Menor producao: " + menor);
        System.out.println("Maior crescimento consecutivo: " + crescimento);

        sc.close();
    }
}