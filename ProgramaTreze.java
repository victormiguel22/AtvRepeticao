package repeticao;
import java.util.Scanner;
public class ProgramaTreze {
	
	public static void main (String[] args) {
	
		int fat = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número: ");
		int num = scanner.nextInt();
		for (int i = num; i > 1; i--) {
			fat *= i;
		}
		System.out.println("O fatorial de "+num+" é: "+fat);
	}
}
