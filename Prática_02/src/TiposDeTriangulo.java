import java.util.Scanner;
public class TiposDeTriangulo {

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
		else if (lado1 == lado2 && lado2 == lado3) {
		    System.out.println("O tri�ngulo � equil�tero");
		}
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
		    System.out.println("O tri�ngulo � is�sceles");
		}
		else {
		    System.out.println("O tri�ngulo � escaleno");
		}
		System.out.println("Gostaria de continuar? (Sim ou N�o)");
		confirma = input.next();
	}while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
}
}

