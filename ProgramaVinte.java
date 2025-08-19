package repeticao;
import java.util.Scanner;

public class ProgramaVinte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas deseja calcular a média?");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a " + i + "ª nota: ");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        double media = soma / n;

        System.out.println("A média aritmética das " + n + " notas é: " + media);

    }
}