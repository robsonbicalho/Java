import java.util.Scanner;
public class TabuadaPrintln {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = scan.nextDouble();
		
		int x = 0;
		while (x <= 10) {
			double resultado = numero * x;
			System.out.println(numero + " X " + x + " = " + resultado);
			x++;
		}
	}
	
}