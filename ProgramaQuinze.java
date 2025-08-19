package repeticao;
import java.util.Scanner;
public class ProgramaQuinze {
	
    public static void main(String[] args) {
        double soma = 0;
        
        System.out.println("Termos da série:");
        for (int k = 37; k >= 1; k--) {
            int numerador = k * (k + 1);
            int denominador = 38 - k;
            double termo = (double) numerador / denominador;
            soma += termo;
            System.out.println("(" + k + " * " + (k + 1) + ")/" + denominador + " = " + (float)termo);
        }
        
        System.out.println("A soma da série é: " + (float)soma);
    }
}