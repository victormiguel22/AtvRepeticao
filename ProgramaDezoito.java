package repeticao;
import java.util.Scanner;

public class ProgramaDezoito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        long n = scanner.nextLong();
        
        boolean primo = true;
        String divisores = "";
        
        if (n <= 1) {
            primo = false;
        } else {
            for (long i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    primo = false;
                    divisores += i + " ";
                }
            }
        }
        
        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
            if (!divisores.isEmpty()) {
                System.out.println("Ele é divisível por: " + divisores);
            }
        }
        
    }
}