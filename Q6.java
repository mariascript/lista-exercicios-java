import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] tempos = new double[n];

        for (int i = 0; i < tempos.length; i++) {
            tempos[i] = sc.nextDouble();
        }
        Arrays.sort(tempos);

        double menor = tempos[0];
        double maior = tempos[tempos.length - 1];

        System.out.printf("Melhor tempo: %.1f\n", menor);
        System.out.printf("Pior tempo: %.1f\n", maior);
        System.out.println("Tres melhores tempos:");
        System.out.printf("%.1f %.1f %.1f\n", tempos[0], tempos[1], tempos[2]);

        sc.close();
    }
}