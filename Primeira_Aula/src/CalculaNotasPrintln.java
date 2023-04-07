import java.util.Scanner;
public class CalculaNotasPrintln {

	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = notas.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = notas.nextDouble();
		System.out.println("Digite a terceira nota");
		double nota3 = notas.nextDouble();
		System.out.printf("Media aritmética = %2.2f\n", (nota1 + nota2 + nota3) / 3);

	}

}
