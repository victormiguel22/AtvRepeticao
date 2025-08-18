package repeticao;
import java.util.Scanner;
public class ProgramaQuatro {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        char confirmar;
	        int anos = 0;
	        do {
	            int popA, popB;
	            double taxaA, taxaB;

	            do {
	                System.out.print("Digite a população do país A: ");
	                popA = scanner.nextInt();
	                if (popA <= 0) {
	                    System.out.println("Erro: A população deve ser maior que zero.");
	                }
	            } while (popA <= 0);

	            do {
	                System.out.print("Digite a taxa de crescimento de A (%): ");
	                taxaA = scanner.nextDouble();
	                if (taxaA <= 0) {
	                    System.out.println("Erro: A taxa deve ser maior que zero.");
	                }
	            } while (taxaA <= 0);

	            do {
	                System.out.print("Digite a população do país B: ");
	                popB = scanner.nextInt();
	                if (popB <= 0) {
	                    System.out.println("Erro: A população deve ser maior que zero.");
	                }
	            } while (popB <= 0);

	            do {
	                System.out.print("Digite a taxa de crescimento de B (%): ");
	                taxaB = scanner.nextDouble();
	                if (taxaB <= 0) {
	                    System.out.println("Erro: A taxa deve ser maior que zero.");
	                }
	            } while (taxaB <= 0);
	            while (popA < popB) {
	                popA += (int)(popA * (taxaA / 100));
	                popB += (int)(popB * (taxaB / 100));
	                anos++;
	            }

	            System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a de B.");
	            System.out.println("População A: " + popA);
	            System.out.println("População B: " + popB);

	            System.out.println("Deseja repetir a operação? (s/n): ");
	            confirmar = scanner.next().toLowerCase().charAt(0);

	        } while (confirmar == 's');
		
	 }
	}
