import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextDouble();
        }

        int p = sc.nextInt();

        reajuste(valores, p);

        sc.close();
    }

    public static void reajuste(double[] valores, int p) {
        double totalAntes = 0;

        for (int i = 0; i < valores.length; i++) {
            totalAntes += valores[i];
        }

        double fator = 1 + (p / 100.0);
        double totalDepois = 0;

        System.out.println("novos valores:");

        for (int i = 0; i < valores.length; i++) {
            valores[i] = valores[i] * fator;
            totalDepois += valores[i];
            System.out.printf("%.2f ", valores[i]);
        }

        System.out.println();
        System.out.printf("total antes do reajuste: %.2f\n", totalAntes);
        System.out.printf("total depois do reajuste: %.2f\n", totalDepois);
    }
}
