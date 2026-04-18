import java.util.Locale;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] notas = new double[n];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
        }

        double maior = notas[0];
        double menor = notas[0];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }

            soma += notas[i];

            if (notas[i] >= 7.0) {
                aprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.printf("maior nota: %.1f\n", maior);
        System.out.printf("menor nota: %.1f\n", menor);
        System.out.printf("media da turma: %.2f\n", media);
        System.out.printf("quantidade de aprovados: %d\n", aprovados);

        sc.close();
    }
}