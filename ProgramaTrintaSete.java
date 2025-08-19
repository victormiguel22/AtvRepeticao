package repeticao;
import java.util.Scanner;

public class ProgramaTrintaSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] gabarito = new char[10];
        char[] respostas = new char[10];
        int maiorAcerto = -1, menorAcerto = 11;
        int totalAlunos = 0;
        int somaNotas = 0;

        System.out.println("Digite o gabarito da prova (10 questões, letras A-E):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = Character.toUpperCase(scanner.next().charAt(0));
        }

        char outroAluno;
        do {
            int acertos = 0;
            System.out.println("\nAluno, digite suas respostas:");

            for (int i = 0; i < 10; i++) {
                System.out.print("Questão " + (i + 1) + ": ");
                respostas[i] = Character.toUpperCase(scanner.next().charAt(0));
                if (respostas[i] == gabarito[i]) {
                    acertos++;
                }
            }

            System.out.println("Você acertou " + acertos + " questões.");
            System.out.println("Sua nota: " + acertos + " pontos");

            totalAlunos++;
            somaNotas += acertos;

            if (acertos > maiorAcerto) maiorAcerto = acertos;
            if (acertos < menorAcerto) menorAcerto = acertos;

            System.out.print("Outro aluno vai utilizar o sistema? (S/N): ");
            outroAluno = Character.toUpperCase(scanner.next().charAt(0));

        } while (outroAluno == 'S');

        System.out.println("\n=== Resultados da Turma ===");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        if (totalAlunos > 0) {
            double mediaNotas = (double) somaNotas / totalAlunos;
            System.out.printf("Média das notas da turma: %.2f\n", mediaNotas);
        }
    }
}