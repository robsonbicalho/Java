import java.util.Scanner;

public class VetorPar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma = 0;

		System.out.println("Digite 10 números:");

		for (int c = 0; c < numeros.length; c++) {
			numeros[c] = input.nextInt();
		}

		System.out.print("Os números digitados foram: ");

		for (int c = 0; c < numeros.length; c++) {
			System.out.print(numeros[c] + " ");
		}
		System.out.print("\n" + "A soma dos números pares é: ");
		String mensagem = "";
		for (int c = 0; c < numeros.length; c++) {
			if (numeros[c] % 2 == 0) {
				soma += numeros[c];
				if (c == numeros.length - 1) {
					mensagem += numeros[c];
				} else {
					mensagem += numeros[c] + " + ";
				}
			}

		}
		System.out.print(mensagem + " = " + soma);
	}
}
