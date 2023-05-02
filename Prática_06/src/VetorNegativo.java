import java.util.Scanner;

public class VetorNegativo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double numeros[] = new double[10];

		System.out.println("Digite 10 números:");

		for (int c = 0; c < numeros.length; c++) {
			numeros[c] = input.nextDouble();
		}

		System.out.print("Os números digitados foram: ");
		for (int c = 0; c < numeros.length; c++) {
			System.out.print(numeros[c] + " ");
		}

		System.out.print("\n" + "As posições do vetor que armazenam números negativos são: ");
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] < 0) {
				System.out.print(c + " ");
			}

		}
	}
}
