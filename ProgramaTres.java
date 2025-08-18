package repeticao;
import java.util.Scanner;

public class ProgramaTres {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome, sexo, estadoCivil;
    int idade;
    double salario;
    boolean validar;

    do {
        System.out.print("Digite o nome (mais de 3 caracteres): ");
        nome = scanner.nextLine();
        if (nome.length() <= 3) {
            System.out.println("Erro: Nome deve ter mais de 3 caracteres.");
            validar = false;
        } else { 
        	validar = true;
        }
        
    } while (validar == false);

    do {
        System.out.print("Digite a idade (0 a 150): ");
        idade = scanner.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Erro: Idade deve estar entre 0 e 150.");
                validar = false;
            } else {
            	validar = true;
            }
        }  
     while (validar == false);

    do {
        System.out.print("Digite o salário (maior que 0): ");
        salario = scanner.nextDouble();
            if (salario < 0) {
                System.out.println("Erro: Salário deve ser maior que 0.");
                validar = false;
            } else {
            validar = true;
            }  
    } while (validar == false);
    scanner.nextLine();

    do {
        System.out.print("Digite o sexo (f/m): ");
        sexo = scanner.nextLine();
        if (!sexo.equals("f") && !sexo.equals("m")) {
            System.out.println("Erro: Sexo deve ser 'f' ou 'm'.");
            validar = false;
        } else if (sexo.equals("f")) {
    	sexo = "feminino";
    	validar = true;
    } else if (sexo.equals("m")) {
    	sexo = "masculino";
    	validar = true;
    }
    } while (validar == false);
    
    do {
    System.out.print("Digite o estado civil (s/c/d/v): ");
    estadoCivil = scanner.nextLine();
    if (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("d") && !estadoCivil.equals("v")) {
        System.out.println("Erro: Estado civil deve ser s, c, v ou d.");
        validar = false;
    } else if (estadoCivil.equals("s")) {
    	validar = true;
    	estadoCivil = "solteiro";
    }  else if (estadoCivil.equals("c")) {
    	validar = true;
    	estadoCivil = "preso";
    }  else if (estadoCivil.equals("v")) {
    	validar = true;
    	estadoCivil = "viúvo";
    }  else if (estadoCivil.equals("d")) {
    	validar = true;
    	estadoCivil = "ex presidiário";
    }
    } while (validar == false);
    
    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
    System.out.println("Salário: R$"+salario);
    System.out.println("Sexo: "+sexo);
    System.out.println("Estado Civil: "+estadoCivil);
}	
}
