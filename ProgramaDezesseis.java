package repeticao;
import java.util.Scanner;
public class ProgramaDezesseis {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de números (n): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("N deve ser maior que zero.");
            return;
        }
        
        double menor, maior, soma;
        System.out.println("Digite o 1º número: ");
        double numero = scanner.nextDouble();
        menor = numero;
        maior = numero;
        soma = numero;
        
        for (int i = 2; i <= n; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = scanner.nextDouble();
            soma += numero;
            if (numero < menor) {
                menor = numero;
            }
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);
        
	}
}