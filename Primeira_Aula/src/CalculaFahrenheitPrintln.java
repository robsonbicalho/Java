import java.util.Scanner;
public class CalculaFahrenheitPrintln {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe a temperatura em Celsius");
		double celsius = scan.nextDouble();
		
		double fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println(celsius + " graus celsius equivalem a " + fahrenheit + " graus fahrenheit");
		

	}

}
