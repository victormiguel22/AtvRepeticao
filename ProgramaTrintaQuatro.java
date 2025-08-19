package repeticao;
import java.util.Scanner;

public class ProgramaTrintaQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intervalo1 = 0;
        int intervalo2 = 0;
        int intervalo3 = 0;
        int intervalo4 = 0;

        System.out.println("Digite números positivos (número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            if (numero <= 25) {
                intervalo1++;
            } else if (numero <= 50) {
                intervalo2++;
            } else if (numero <= 75) {
                intervalo3++;
            } else if (numero <= 100) {
                intervalo4++;
            }
        }

        System.out.println("\nQuantidade de números em cada intervalo:");
        System.out.println("[0-25]: " + intervalo1);
        System.out.println("[26-50]: " + intervalo2);
        System.out.println("[51-75]: " + intervalo3);
        System.out.println("[76-100]: " + intervalo4);
    }
}