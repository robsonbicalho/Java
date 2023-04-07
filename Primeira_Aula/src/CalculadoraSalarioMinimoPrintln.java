import java.util.Scanner;
public class CalculadoraSalarioMinimo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o valor atual do salario minimo");
		double smin = scan.nextDouble();
		System.out.println("Informe o valor do salario");
		double sfunc = scan.nextDouble();
		
		double qtsmin = sfunc /= smin;
		System.out.println("O salario informado equivale a " + qtsmin + " salarios minimos");
		

	}

}