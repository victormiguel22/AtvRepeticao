package repeticao;
import java.util.Scanner;

public class ProgramaTrinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int codigo;
        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double altura, peso;
        double maiorAltura = Double.MIN_VALUE, menorAltura = Double.MAX_VALUE;
        double maiorPeso = Double.MIN_VALUE, menorPeso = Double.MAX_VALUE;
        double somaAltura = 0, somaPeso = 0;
        int contador = 0;
        
        while (true) {
            System.out.print("Digite o código do cliente (0 para encerrar): ");
            codigo = scanner.nextInt();
            if (codigo == 0) break;
            
            System.out.print("Digite a altura do cliente: ");
            altura = scanner.nextDouble();
            
            System.out.print("Digite o peso do cliente: ");
            peso = scanner.nextDouble();
            
            if (altura > maiorAltura) {
                maiorAltura = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < menorAltura) {
                menorAltura = altura;
                codigoMaisBaixo = codigo;
            }
            if (peso > maiorPeso) {
                maiorPeso = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < menorPeso) {
                menorPeso = peso;
                codigoMaisMagro = codigo;
            }
            
            somaAltura += altura;
            somaPeso += peso;
            contador++;
        }
        
        if (contador > 0) {
            System.out.println("\nCliente mais alto: código " + codigoMaisAlto + " - altura " + maiorAltura);
            System.out.println("Cliente mais baixo: código " + codigoMaisBaixo + " - altura " + menorAltura);
            System.out.println("Cliente mais gordo: código " + codigoMaisGordo + " - peso " + maiorPeso);
            System.out.println("Cliente mais magro: código " + codigoMaisMagro + " - peso " + menorPeso);
            System.out.println("Média das alturas: " + (somaAltura / contador));
            System.out.println("Média dos pesos: " + (somaPeso / contador));
        } else {
            System.out.println("Nenhum cliente cadastrado.");
        }
    }
}