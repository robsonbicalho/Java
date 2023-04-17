import java.util.Arrays;
import java.util.Scanner;

public class VetorMaiorEMenor {

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
		System.out.print("\n" + "O menor e o maior número são, respectivamente: ");
		Arrays.sort(numeros);

		System.out.print(numeros[0] + " e " + numeros[9]);

	}
}
