package repeticao;

public class ProgramaVinteCinco {
    public static void main(String[] args) {
        double precoUnitario = 1.99;

        System.out.println("Lojas Quase Dois - Tabela de preços");

        for (int i = 1; i <= 50; i++) {
            double total = i * precoUnitario;
            System.out.println(i + " - R$" +total);
        }
    }
}
