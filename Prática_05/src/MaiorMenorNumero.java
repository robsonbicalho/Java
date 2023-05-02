import java.util.Scanner;

public class MaiorMenorNumero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int numero = 0;

		System.out.println("Informe os números (Digite uma letra para sair)");

		for (;;) {
			if (input.hasNextInt()) {
				numero = input.nextInt();
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
				if (numero < menorNumero) {
					menorNumero = numero;
				}
			} else {
				break;
			}
		}

		System.out.println("O menor número é: " + menorNumero + "\n" + "O maior número é: " + maiorNumero);
	}
}