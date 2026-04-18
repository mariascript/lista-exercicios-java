import java.util.Locale;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] tempos = new double[n];

        for (int i = 0; i < tempos.length; i++) {
            tempos[i] = sc.nextDouble();
        }

        processar(tempos);

        sc.close();
    }

    public static void processar(double[] tempos) {

        for (int i = 0; i < tempos.length - 1; i++) {
            for (int j = 0; j < tempos.length - 1 - i; j++) {
                if (tempos[j] > tempos[j + 1]) {
                    double temp = tempos[j];
                    tempos[j] = tempos[j + 1];
                    tempos[j + 1] = temp;
                }
            }
        }

        double menor = tempos[0];
        double maior = tempos[tempos.length - 1];

        System.out.printf("melhor tempo: %.1f\n", menor);
        System.out.printf("pior tempo: %.1f\n", maior);
        System.out.println("tres melhores tempos:");
        System.out.printf("%.1f %.1f %.1f\n", tempos[0], tempos[1], tempos[2]);
    }
}
