package repeticao;
import java.util.Scanner;

public class ProgramaDoze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Qual o tamanho da sequência?: ");
        int seq = scanner.nextInt();
        
        if (seq <= 0) {
            System.out.println("Digite um número maior que zero.");
        } else {
            int primeiro = 1;
            int segundo = 1;

            System.out.println("Série de Fibonacci até o " + seq + "º termo:");

            for (int i = 1; i <= seq; i++) {
                if (i == 1 || i == 2) {
                    System.out.print("1 ");
                } else {
                    int proximo = primeiro + segundo;
                    System.out.print(proximo + " ");
                    primeiro = segundo;
                    segundo = proximo;
                }
            }
        }
    }
}