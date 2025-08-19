package repeticao;
import java.util.Scanner;

public class ProgramaVinteDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de votantes: ");
        int totalVotantes = scanner.nextInt();

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;

        for (int i = 1; i <= totalVotantes; i++) {
            System.out.println("Votante " + i + ", digite seu voto (1, 2 ou 3): ");
            int voto = scanner.nextInt();

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto inválido! Não será contabilizado.");
            }
        }

        System.out.println("\nResultado da eleição:");
        System.out.println("Candidato 1: " + votosCandidato1 + " votos");
        System.out.println("Candidato 2: " + votosCandidato2 + " votos");
        System.out.println("Candidato 3: " + votosCandidato3 + " votos");

    }
}