package repeticao;
import java.util.Scanner;
public class ProgramaOito {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite o primeiro número do intervalo");
		num1 = scanner.nextInt();
		System.out.println("Digite o segundo número do intervalo");
		num2 = scanner.nextInt();
		if (num2 < num1) {
			int aux = num1;
			num1 = num2;
			num2 = aux;
		} else if (num2 == num1) {
			System.out.print("Intervalo entre números iguais não existe");
		}		
		int soma = 0;
		System.out.print("O intervalo é: ");
			for (int i = num1+1; i < num2; i++) {
				soma += i;
				System.out.print(i+ " ");
			}
			System.out.println("\nA soma dos números do intervalo é: "+soma);
		}
	}

