package repeticao;
import java.util.Scanner;

public class ProgramaVinteSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Lojas Tabajara");
            double total = 0;
            int produto = 1;
            double preco;
            
            while (true) {
                System.out.print("Produto " + produto + ": R$ ");
                preco = scanner.nextDouble();
                if (preco == 0) {
                    break; 
                }
                total += preco;
                produto++;
            }
            
            System.out.println("Total: R$ " + String.format("%.2f", total));
            System.out.print("Dinheiro: R$ ");
            double dinheiro = scanner.nextDouble();
            double troco = dinheiro - total;
            System.out.println("Troco: R$ " + String.format("%.2f", troco));
            
            System.out.println("\n--- Próxima compra ---\n");
        }
    }
}