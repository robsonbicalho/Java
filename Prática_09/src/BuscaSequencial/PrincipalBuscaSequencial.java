package BuscaSequencial;
import java.util.Scanner;

public class PrincipalBuscaSequencial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[11];
		String confirma;

		System.out.println("Informe 10 números: ");

		for (int i = 0; i < vetor.length - 1; i++) {
			vetor[i] = input.nextDouble();
		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = input.nextDouble();
			System.out.println("Selecione o tipo de busca: ");
			System.out.println("1 - Sequêncial");
			System.out.println("2 - Sequêncial com sentinela");
			int opcao = input.nextInt();

			switch (opcao) {
			case 1:
				MecanismosDeBuscaSequencial.buscaSequencial(vetor, v);
				break;
			case 2:
				MecanismosDeBuscaSequencial.buscaSequencialSentinela(vetor, v);
				break;
			default:
				System.out.println("Opção inválida.");
			}

			System.out.println("Gostaria de continuar? (Sim ou Não)");
			confirma = input.next();

		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));

		System.exit(0);
	}
}
