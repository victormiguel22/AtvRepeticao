package repeticao;
import java.util.Scanner;

public class ProgramaTrintaCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int quantidade;
        double totalGeral = 0;

        System.out.println("==== Cardápio ====");
        System.out.println("100 - Cachorro Quente - R$ 1,20");
        System.out.println("101 - Bauru Simples    - R$ 1,30");
        System.out.println("102 - Bauru com ovo    - R$ 1,50");
        System.out.println("103 - Hambúrguer       - R$ 1,20");
        System.out.println("104 - Cheeseburguer    - R$ 1,30");
        System.out.println("105 - Refrigerante     - R$ 1,00");
        System.out.println("===================");
        System.out.println("Digite 0 como código para encerrar o pedido.");

        do {
            System.out.print("Digite o código do item: ");
            codigo = scanner.nextInt();

            if (codigo == 0) {
                break; // encerra o pedido
            }

            System.out.print("Digite a quantidade desejada: ");
            quantidade = scanner.nextInt();

            double preco = 0;
            String item = "";

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    item = "Cachorro Quente";
                    break;
                case 101:
                    preco = 1.30;
                    item = "Bauru Simples";
                    break;
                case 102:
                    preco = 1.50;
                    item = "Bauru com ovo";
                    break;
                case 103:
                    preco = 1.20;
                    item = "Hambúrguer";
                    break;
                case 104:
                    preco = 1.30;
                    item = "Cheeseburguer";
                    break;
                case 105:
                    preco = 1.00;
                    item = "Refrigerante";
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    continue; // volta para o início do loop
            }

            double valorItem = preco * quantidade;
            totalGeral += valorItem;

            System.out.printf("%s - Quantidade: %d - Valor: R$ %.2f%n", item, quantidade, valorItem);

        } while (true);

        System.out.printf("Total do pedido: R$ %.2f%n", totalGeral);
    }
}