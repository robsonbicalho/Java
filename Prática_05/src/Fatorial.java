import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.println("Informe um número inteiro maior ou igual a zero:");
		int numero1 = input.nextInt();

		if (numero1 < 0) {
			System.out.println("Número inválido");
		} else {
			System.out.print("O fatorial de " + numero1 + " é: ");
			if (numero1 > 0) {
				soma = numero1 - 1;
				for (; soma >= 1; soma--) {
					numero1 *= soma;
				}
				System.out.print(numero1);
			} else {
				System.out.print("1");
			}

		}

	}
}