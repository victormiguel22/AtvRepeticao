package repeticao;
import java.util.Scanner;

public class ProgramaVinteQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs da coleção: ");
        int qtdCds = scanner.nextInt();

        double somaValores = 0;

        for (int i = 1; i <= qtdCds; i++) {
            System.out.println("Digite o valor do CD " + i + ": ");
            double valorCd = scanner.nextDouble();
            somaValores += valorCd;
        }

        double media = somaValores / qtdCds;

        System.out.println("Valor total investido: R$ " + somaValores);
        System.out.println("Valor médio por CD: R$ " + media);

    }
}