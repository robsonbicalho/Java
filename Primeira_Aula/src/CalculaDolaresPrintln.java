import java.util.Scanner;
public class CalculadoraCotacao {

	public static void main(String[] args) {
		Scanner dinheiro = new Scanner(System.in);
		
		System.out.println("Digite a cotacao do dolar");
		double CotDolar = dinheiro.nextDouble();
		System.out.println("Digite a quantidade de dolares que voce possui");
		double QntDolar = dinheiro.nextDouble();
		
		double QntReais = QntDolar *= CotDolar;
		System.out.println("Voce possui: " + QntReais + " Reais");

	}

}
