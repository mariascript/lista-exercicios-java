import java.util.Locale;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();

        double[][] notas = new double[l][c];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                notas[i][j] = sc.nextDouble();
            }
        }

        int aprovados = 0;

        for (int i = 0; i < l; i++) {
            double soma = 0;

            for (int j = 0; j < c; j++) {
                soma += notas[i][j];
            }

            double mediaAluno = soma / c;

            System.out.printf("Media do aluno %d: %.2f\n", i, mediaAluno);

            if (mediaAluno >= 7.0) {
                aprovados++;
            }
        }

        for (int j = 0; j < c; j++) {
            double soma = 0;

            for (int i = 0; i < l; i++) {
                soma += notas[i][j];
            }

            double mediaAvaliacoes = soma / l;

            System.out.printf("Media da avaliacao %d: %.2f\n", j, mediaAvaliacoes);
        }

        System.out.println("Quantidade de alunos aprovados: " + aprovados);

        sc.close();
    }
}