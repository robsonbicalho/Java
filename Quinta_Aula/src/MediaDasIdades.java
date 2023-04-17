import java.util.Scanner;

public class MediaDasIdades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int idade = 0;
		int soma = 0;
		int contador = 0;

		System.out.println("Informe as idades (Digite um número negativo para sair)");
		for (;;) {
			idade = input.nextInt();
			if (idade < 0) {
				break;
			} else {
				soma += idade;
				contador++;
			}
		}
		if (contador == 0) {
			System.out.println("Não foram informadas idades validas");
		} else {
			double media = (soma / contador);
			System.out.println("A media das idades é: " + media);
		}
	}
}