import java.util.Scanner;

public class MaiorMenorNumeroDezNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = Integer.MIN_VALUE;
		int menorNumero = Integer.MAX_VALUE;
		int numero = 0;
		int contador = 1;

		System.out.println("Informe dez números");

		for (; contador <= 10; contador++) {
			if (input.hasNextInt()) {
				numero = input.nextInt();
				if (numero >= maiorNumero) {
					maiorNumero = numero;
				}
				if (numero < menorNumero) {
					menorNumero = numero;
				}
			} else {
				System.out.println("Carácter inválido");
				System.exit(0);
			}
		}

		System.out.println("O menor número é: " + menorNumero + "\n" + "O maior número é: " + maiorNumero);
	}
}