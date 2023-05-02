import java.util.Scanner;

public class VetorPosiçõesPar {

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
		System.out.println("\n" + "As posições do vetor que possum números pares são: ");
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] % 2 == 0) {
				System.out.println("Posição " + c + ": " + numeros[c]);

			}

		}
	}
}
