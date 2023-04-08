import java.util.Scanner;
public class CondExistênnciaTriângulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String confirma;
		
		do {
		System.out.println("Informe os três lados do triângulo: ");
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		double lado3 = input.nextDouble();
		
		if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
		    System.out.println("O triângulo não satisfaz a condição de existência");
		}
		else {
			System.out.println("O triângulo satisfaz a condição de existência");
		}
		System.out.println("Gostaria de conferir outro triângulo?");
		confirma = input.next();
		
	} while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
}
}