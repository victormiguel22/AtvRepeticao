package repeticao;
import java.util.Scanner;
public class ProgramaUm {

	public static void main (String[] args) {
	float nota;
	boolean validar;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("Digite uma nota de 0 a 10: ");
		nota = scanner.nextFloat();
		if (nota < 0 || nota > 10) {
			System.out.println("Erro: Nota inválida");
			validar = false;
		} else {
			validar = true;
		}
	} while (validar == false);
}
}
