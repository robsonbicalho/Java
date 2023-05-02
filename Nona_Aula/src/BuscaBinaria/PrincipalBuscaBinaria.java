package BuscaBinaria;
import java.util.Scanner;

public class PrincipalBuscaBinaria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double vetor[] = new double[10];
		String confirma;
		double numeroAnterior = 0;
		double numeroAtual = 0;

		System.out.println("Informe 10 números, ordenadamente: ");

		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.nextDouble();
			numeroAtual = vetor[i];
			if (numeroAtual < numeroAnterior) {
				System.out.println("A sequência não está ordenada.");
				System.exit(0);
			}
			numeroAnterior = numeroAtual;
		}
		do {
			System.out.println("Informe o valor a ser procurado: ");
			double v = input.nextDouble();

			MecanismosDeBuscaBinaria.buscaBinaria(vetor, v);

			System.out.println("Gostaria de continuar? (Sim ou Não)");
			confirma = input.next();

		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));

		System.exit(0);
	}
}