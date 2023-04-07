import java.util.Scanner;
public class CalculadoraAumento {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu salario");
		double salario = scan.nextDouble();
		
		double aumento = salario / 100 * 25 + salario; 
		System.out.println("Seu novo salario: " + aumento);
	}

}
