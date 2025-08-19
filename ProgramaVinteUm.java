package repeticao;
import java.util.Scanner;

public class ProgramaVinteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas tem na turma?");
        int n = scanner.nextInt();

        int somaIdades = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / n;

        System.out.println("Média de idade da turma: " + media);

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media <= 60) {
            System.out.println("A turma é adulta.");
        } else {
            System.out.println("A turma é idosa.");
        }
    }
}