package repeticao;
import java.util.Scanner;

public class ProgramaTrintaUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAluno;
        int numeroMaisAlto = 0, numeroMaisBaixo = 0;
        double altura;
        double maiorAltura = Double.MIN_VALUE;
        double menorAltura = Double.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do aluno: ");
            numeroAluno = scanner.nextInt();
            
            System.out.print("Digite a altura do aluno em cm: ");
            altura = scanner.nextDouble();

            if (altura > maiorAltura) {
                maiorAltura = altura;
                numeroMaisAlto = numeroAluno;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                numeroMaisBaixo = numeroAluno;
            }
        }

        System.out.println("\nAluno mais alto: número " + numeroMaisAlto + " - altura " + maiorAltura + " cm");
        System.out.println("Aluno mais baixo: número " + numeroMaisBaixo + " - altura " + menorAltura + " cm");
    }
}
