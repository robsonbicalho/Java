package TratamentoDeExce��o;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("O sistema realiza apenas opera��es com n�meros inteiros maiores do que zero");
		System.out.println("Informe o numerador: ");
		int numerador = input.nextInt();
		System.out.println("Informe o denominador: ");
		int denominador = input.nextInt();
		
		try {
		Divis�o d = new Divis�o(numerador, denominador);
		System.out.println("O resultado �: " + d.operacao());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
