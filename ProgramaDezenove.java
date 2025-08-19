package repeticao;
import java.util.Scanner;

public class ProgramaDezenove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();

        int contadorDivisoes = 0;

        System.out.println("Números primos entre 1 e " + n + ":");

        for (int i = 2; i <= n; i++) {
            boolean primo = true;

            for (int j = 2; j <= i / 2; j++) {
                contadorDivisoes++;
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(i);
            }
        }

        System.out.println("Total de divisões executadas: " + contadorDivisoes);

    }
}