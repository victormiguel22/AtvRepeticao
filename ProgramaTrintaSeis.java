package repeticao;
import java.util.Scanner;

public class ProgramaTrintaSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto;
        int totalCandidato1 = 0, totalCandidato2 = 0, totalCandidato3 = 0, totalCandidato4 = 0;
        int totalNulos = 0, totalBrancos = 0;

        System.out.println("==== Eleição Presidencial ====");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("Digite 0 para encerrar a votação.");
        System.out.println("==============================");

        do {
            System.out.print("Digite o código do seu voto: ");
            voto = scanner.nextInt();

            switch (voto) {
                case 0:
                    break;
                case 1:
                    totalCandidato1++;
                    break;
                case 2:
                    totalCandidato2++;
                    break;
                case 3:
                    totalCandidato3++;
                    break;
                case 4:
                    totalCandidato4++;
                    break;
                case 5:
                    totalNulos++;
                    break;
                case 6:
                    totalBrancos++;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
            }

        } while (voto != 0);

        int totalVotos = totalCandidato1 + totalCandidato2 + totalCandidato3 + totalCandidato4 + totalNulos + totalBrancos;

        System.out.println("\n==== Resultado da Eleição ====");
        System.out.println("José: " + totalCandidato1 + " votos");
        System.out.println("João: " + totalCandidato2 + " votos");
        System.out.println("Maria: " + totalCandidato3 + " votos");
        System.out.println("Ana: " + totalCandidato4 + " votos");
        System.out.println("Votos Nulos: " + totalNulos);
        System.out.println("Votos em Branco: " + totalBrancos);

        if (totalVotos > 0) {
            double percNulos = (totalNulos * 100.0) / totalVotos;
            double percBrancos = (totalBrancos * 100.0) / totalVotos;
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
            System.out.printf("Percentual de votos em branco: %.2f%%\n", percBrancos);
        } else {
            System.out.println("Nenhum voto registrado.");
        }
    }
}