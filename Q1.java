import java.util.Locale;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] consumo = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            consumo[i] = sc.nextInt();
            total += consumo[i];
        }

        double media = (double) total / n;

        int acimaMedia = 0;
        for (int i = 0; i < n; i++) {
            if (consumo[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("consumo total: " + total);
        System.out.printf("consumo medio: %.2f\n", media);
        System.out.println("dias acima da media: " + acimaMedia);

        sc.close();
    }
}