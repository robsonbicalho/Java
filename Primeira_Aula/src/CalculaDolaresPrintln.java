import java.util.Scanner;
public class CalculaDolaresPrintln {

	public static void main(String[] args) {
		Scanner dinheiro = new Scanner(System.in);
		
		System.out.println("Digite a cotação do dólar");
		double CotDolar = dinheiro.nextDouble();
		System.out.println("Digite a quantidade de dólares que você possui");
		double QntDolar = dinheiro.nextDouble();
		
		double QntReais = QntDolar *= CotDolar;
		System.out.println("Você possui: " + QntReais + " Reais");

	}

}
