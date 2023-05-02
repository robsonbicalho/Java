package TratamentoDeExceção;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("O sistema realiza apenas operações com números inteiros maiores do que zero");
		System.out.println("Informe o numerador: ");
		int numerador = input.nextInt();
		System.out.println("Informe o denominador: ");
		int denominador = input.nextInt();
		
		try {
		Divisão d = new Divisão(numerador, denominador);
		System.out.println("O resultado é: " + d.operacao());
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
