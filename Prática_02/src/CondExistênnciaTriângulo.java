import java.util.Scanner;
public class CondExist�nnciaTri�ngulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String confirma;
		
		do {
		System.out.println("Informe os tr�s lados do tri�ngulo: ");
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		double lado3 = input.nextDouble();
		
		if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
		    System.out.println("O tri�ngulo n�o satisfaz a condi��o de exist�ncia");
		}
		else {
			System.out.println("O tri�ngulo satisfaz a condi��o de exist�ncia");
		}
		System.out.println("Gostaria de conferir outro tri�ngulo?");
		confirma = input.next();
		
	} while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
}
}