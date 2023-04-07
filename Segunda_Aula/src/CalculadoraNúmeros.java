import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraNúmero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Digite dois números inteiros quaisquer: ");
		double numero1 = input.nextDouble();
		double numero2 = input.nextDouble();
		
		System.out.println("Escolha uma operação: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Multiplicação");
		System.out.println("3 - Subtração");
		System.out.println("4 - Divisão");
		int operacao = input.nextInt();
		
		switch (operacao) {
			case 1:
				System.out.println("A soma dos números é: " + df.format(numero1 + numero2));
				break;
			case 2:
				System.out.println("A multiplicação dos números é: " + df.format(numero1 * numero2));
				break;
			case 3:
				System.out.println("A subtração dos números é: " + df.format(numero1 - numero2));
				break;
			case 4:
				if (numero1 == 0 || numero2 == 0) {
					System.out.println("A divisão é invalida");
					return;
				}
				else {
					System.out.println("A divisão dos números é: " + df.format(numero1 / numero2));	
				}
				break;
			default:
				System.out.println("Código inválido");
                break;
		
		}
		
	
	}

}
