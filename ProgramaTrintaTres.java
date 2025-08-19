package repeticao;
import java.util.Scanner;

public class ProgramaTrintaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da dívida: R$ ");
        double valorDivida = scanner.nextDouble();

        // Arrays com a quantidade de parcelas e os percentuais de juros
        int[] parcelas = {1, 3, 6, 9, 12};
        double[] jurosPercentual = {0, 10, 15, 20, 25};

        System.out.println("\nValor da Dívida  Juros  Parcelas   Valor da Parcela");

        for (int i = 0; i < parcelas.length; i++) {
            double valorJuros = valorDivida * jurosPercentual[i] / 100.0;
            double valorTotal = valorDivida + valorJuros;
            double valorParcela = valorTotal / parcelas[i];

            System.out.println("R$"+valorDivida+ "          R$"+ valorJuros + "   " + i + "      R$"+ (float)valorParcela);
        }
    }
}
