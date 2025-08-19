package repeticao;
import java.util.Scanner;

public class ProgramaVinteSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do pão: ");
        double precoPao = scanner.nextDouble();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            double total = i * precoPao;
            System.out.println(i + " - R$ " + String.format("%.2f", total));
        }
    }
}