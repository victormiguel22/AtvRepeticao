package repeticao;
import java.util.Scanner;

public class ProgramaTrintaDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoCidade;
        int numeroVeiculos;
        int numeroAcidentes;

        int maiorIndiceAcidenteCidade = 0;
        double maiorIndiceAcidente = -1;

        int menorIndiceAcidenteCidade = 0;
        double menorIndiceAcidente = Double.MAX_VALUE;

        int somaVeiculos = 0;
        int somaAcidentesMenos2000 = 0;
        int contadorMenos2000 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Cidade " + i + ":");

            System.out.print("Código da cidade: ");
            codigoCidade = scanner.nextInt();

            System.out.print("Número de veículos de passeio (1999): ");
            numeroVeiculos = scanner.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas (1999): ");
            numeroAcidentes = scanner.nextInt();

            double indiceAcidente = (double) numeroAcidentes / numeroVeiculos;

            if (indiceAcidente > maiorIndiceAcidente) {
                maiorIndiceAcidente = indiceAcidente;
                maiorIndiceAcidenteCidade = codigoCidade;
            }

            if (indiceAcidente < menorIndiceAcidente) {
                menorIndiceAcidente = indiceAcidente;
                menorIndiceAcidenteCidade = codigoCidade;
            }

            somaVeiculos += numeroVeiculos;

            if (numeroVeiculos < 2000) {
                somaAcidentesMenos2000 += numeroAcidentes;
                contadorMenos2000++;
            }

            System.out.println();
        }

        System.out.println("Maior índice de acidentes: cidade " + maiorIndiceAcidenteCidade + " - índice " + String.format("%.2f", maiorIndiceAcidente));
        System.out.println("Menor índice de acidentes: cidade " + menorIndiceAcidenteCidade + " - índice " + String.format("%.2f", menorIndiceAcidente));
        System.out.println("Média de veículos nas cinco cidades: " + (somaVeiculos / 5.0));

        if (contadorMenos2000 > 0) {
            System.out.println("Média de acidentes nas cidades com menos de 2000 veículos: " + (somaAcidentesMenos2000 / (double) contadorMenos2000));
        } else {
            System.out.println("Nenhuma cidade possui menos de 2000 veículos.");
        }
    }
}