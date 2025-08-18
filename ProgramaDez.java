package repeticao;
import java.util.Scanner;
public class ProgramaDez {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int exp, base, resultado = 1;
		
		System.out.println("Digite a base: ");
		base = scanner.nextInt();
		System.out.println("Digite o expoente: ");
		exp = scanner.nextInt();
		for (int i = 1; i <= exp; i++) {
			resultado *= base;
		}
		System.out.println("O resultado é: "+resultado);
	}
}
