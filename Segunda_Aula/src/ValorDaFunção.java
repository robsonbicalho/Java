import java.util.Scanner;
import java.text.DecimalFormat;
public class ValorDaFunção {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Informe um valor qualquer");
		double x = input.nextDouble();
		
		if (x < -2) {
			System.out.println("O valor da função é: " + df.format(2 * x + 2));
		}
		else if (x >= -2 && x < 3) {
			System.out.println("O valor da função é: " + df.format(x * 0 + 3));
		}
		else {
			System.out.println("O valor da função é: " + df.format(-x));
		}
	}

}
