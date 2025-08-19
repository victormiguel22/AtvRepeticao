package repeticao;
import java.util.Scanner;

public class ProgramaVinteTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de turmas: ");
        int qtdTurmas = scanner.nextInt();

        int somaAlunos = 0;

        for (int i = 1; i <= qtdTurmas; i++) {
            int alunos;
            do {
                System.out.println("Digite a quantidade de alunos da turma " + i + " (máximo 40): ");
                alunos = scanner.nextInt();

                if (alunos > 40) {
                    System.out.println("Número inválido! A turma não pode ter mais de 40 alunos.");
                }
            } while (alunos > 40);

            somaAlunos += alunos;
        }

        double media = (double) somaAlunos / qtdTurmas;

        System.out.println("O número médio de alunos por turma é: " + media);

    }
}