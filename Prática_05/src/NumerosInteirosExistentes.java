import java.util.Scanner;

public class NumerosInteirosExistentes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int soma = 0;
		System.out.println("Informe dois números inteiros positivos: ");
		int numero1 = input.nextInt();
		int numero2 = input.nextInt();

		if (numero1 < numero2 && numero1 > 0 && numero2 > 0) {
			soma = numero1 + 1;
			System.out.println("Os números inteiros entre " + numero1 + " e " + numero2 + " são: ");
			for (; soma < numero2; soma++) {
				System.out.println(soma);
			}
		} else if (numero1 > numero2 && numero1 > 0 && numero2 > 0) {
			soma = numero2 + 1;
			System.out.println("Os números inteiros entre " + numero2 + " e " + numero1 + " são: ");
			for (; soma < numero1; soma++) {
				System.out.println(soma);
			}
		} else if (numero1 == numero2 && numero1 > 0 && numero2 > 0) {
			System.out.println("Os números informados são iguais");
		} else {
			if (numero1 <= 0 && numero2 > 0) {
				System.out.println(numero1 + " é um número inválido");
			} else if (numero1 <= 0 && numero2 <= 0) {
				System.out.println(numero1 + " e " + numero2 + " são números inválidos");
			} else {
				System.out.println(numero2 + " é um número inválido");
			}
		}

	}
}
