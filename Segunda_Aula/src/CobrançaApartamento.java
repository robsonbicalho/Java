import java.util.Scanner;
public class CobrançaApartament {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selecione o tipo de apartamento (1 ou 2)");
		System.out.println("1 - Simples");
		System.out.println("2 - Duplo");
		int apartamento = input.nextInt();
		
		System.out.println("Informe a quantidade de dias hospedado: ");
		int dias = input.nextInt();
		
		switch (apartamento) {
		case 1:
			if (dias <= 0) {
				System.out.println("Informações invalidas");
			}
			else if (dias < 10) {
				System.out.println("O valor a ser pago é de: R$" + (dias * 100));
			}
			else if (dias >= 10 && dias <= 15) {
				System.out.println("O valor a ser pago é de: R$" + (dias * 90));
			}
			else {
				System.out.println("O valor a ser pago é de: R$" + (dias * 80));
			}
		break;
		case 2:
			if (dias <= 0) {
				System.out.println("Informações invalidas");
			}
			else if(dias < 10) {
				System.out.println("O valor a ser pago é de: R$" + (dias * 140));
			}
			else if (dias >= 10 && dias <= 15) {
				System.out.println("O valor a ser pago é de: R$" + (dias * 120));
			}
			else {
				System.out.println("O valor a ser pago é de: R$" + (dias * 100));
			}
		break;
		default:
			System.out.println("Informações invalidas");
		break;
		}
		

	}

}
