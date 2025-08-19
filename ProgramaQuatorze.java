package repeticao;
import java.util.Scanner;
public class ProgramaQuatorze {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número de termos (n): ");
	        int n = scanner.nextInt();
	        
	        double soma = 0;
	        
	        for (int k = 1; k <= n; k++) {
	            int denominador = 2 * k - 1;
	            double termo = (double) k / denominador;
	            soma += termo;
	        }
	        
	        System.out.println("A soma dos "+n+" termos da série é: "+ soma);
	        
	   }
	}