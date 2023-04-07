import java.util.Scanner;
public class CalculaEsferaPrintln {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o raio da esfera");
		double raio = scan.nextDouble();
		
		double comprimento = 2 * Math.PI * raio;
		double area = 3.14 * Math.pow(raio, 2);
		double volume = (Math.PI * Math.pow(raio, 3) * 3 / 4);
		
		System.out.println("O comprimento vale: " + comprimento);
		System.out.println("A área vale: " + area);
		System.out.println("O volume vale: " + volume);
	}

}
