import java.util.Scanner;
public class TiposDeTriangulo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe os três lados do triângulo: ");
		double lado1 = input.nextDouble();
		double lado2 = input.nextDouble();
		double lado3 = input.nextDouble();
		
		if (lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1 || lado1 + lado3 <= lado2) {
		    System.out.println("O triângulo não satisfaz a condição de existência");
		}
		else if (lado1 == lado2 && lado2 == lado3) {
		    System.out.println("O triãngulo é equilátero");
		}
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
		    System.out.println("O triângulo é isósceles");
		}
		else {
		    System.out.println("O triângulo é escaleno");
		}
		
	}

}
