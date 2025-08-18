package repeticao;
import java.util.Scanner;
public class ProgramaOnze {

	public static void main(String[] args) {
		int par = 0, impar = 0, num;
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o "+i+"º número: ");
			num = scanner.nextInt();
			if (num%2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade de números pares: "+par);
		System.out.println("Quantidade de números ímpares: "+impar);
	}
}
