package repeticao;
import java.util.Scanner;

public class ProgramaVinteOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double temperatura;
        double menor = 999999999;
        double maior = -999999999;
        double soma = 0;
        int contador = 0;
        
        System.out.println("Digite as temperaturas (digite 999 para encerrar):");
        
        while (true) {
            System.out.print("Temperatura: ");
            temperatura = scanner.nextDouble();
            
            if (temperatura == 999) {
                break; 
            }
            
            soma += temperatura;
            contador++;
            
            if (temperatura < menor) {
                menor = temperatura;
            }
            if (temperatura > maior) {
                maior = temperatura;
            }
        }
        
        if (contador > 0) {
            double media = soma / contador;
            System.out.println("Menor temperatura: " + menor + "ºC");
            System.out.println("Maior temperatura: " + maior + "ºC");
            System.out.println("Média das temperaturas: " + String.format("%.2f", media));
        } else {
            System.out.println("Nenhuma temperatura foi informada.");
        }
    }
}