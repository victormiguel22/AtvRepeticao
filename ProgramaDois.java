package repeticao;
import java.util.Scanner;
public class ProgramaDois {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String usuario, senha;
		boolean validar;
		do {
			System.out.println("Digite um nome de usuário: ");
			usuario = scanner.nextLine();
			System.out.println("Digite sua senha: ");
			senha = scanner.nextLine();
			if (usuario.equals(senha)) {
				System.out.println("Erro: senha não pode ser igual ao usuário");
				validar = false;
			} else {
				validar = true;
			}
		} while (validar == false);
		
		System.out.println("Bem-vindo, "+usuario);
	}
}
