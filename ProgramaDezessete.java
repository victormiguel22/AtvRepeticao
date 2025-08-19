package repeticao;
import java.util.Scanner;
public class ProgramaDezessete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        long n = scanner.nextLong();
        
        boolean primo = true;
        
        if (n <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        
        if (primo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        
    }
}

