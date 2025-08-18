package repeticao;
import java.util.Scanner;
public class ProgramaNove {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número::  ");
		int num = scanner.nextInt();
		for (int i = 0; i < 11; i++) {
			System.out.println(num+ " X "+ i + " = " + num*i);
		}
		
	}
}
