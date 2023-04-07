import java.util.Scanner;
public class CalculaPesoPrintln {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Informe o seu peso");
		double peso = scan.nextDouble();
		
		double pengordou = (peso / 100) * 15 + peso;
		double pemagreceu = (peso / 100) * 20 + peso;
		System.out.println("Caso haja uma perda de 20%, o novo peso será de: " + pemagreceu + "KG");
		System.out.println("Caso haja um ganho de 15%, o novo peso será de: " + pengordou + "KG");
		

	}

}