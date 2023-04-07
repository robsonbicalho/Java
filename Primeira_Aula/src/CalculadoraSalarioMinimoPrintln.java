import java.util.Scanner;
public class CalculadoraSalarioMinimoPrintln {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o valor atual do salário mínimo");
		double smin = scan.nextDouble();
		System.out.println("Informe o valor do salário");
		double sfunc = scan.nextDouble();
		
		double qtsmin = sfunc /= smin;
		System.out.println("O salário informado equivale a " + qtsmin + " salários mínimos");
		

	}

}