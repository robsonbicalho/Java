import java.util.Scanner;
public class DiáriasHotel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String confirma;
		
		do {
		System.out.println("Informe a quantidade de diárias: ");
		double diarias = input.nextDouble();
		
		if (diarias <= 0) {
			System.out.println("Valor inválido");
		}
		else if(diarias < 15) {
			System.out.println("A valor a ser pago é de: " + ((500 * diarias) + (15 * diarias)));
		}
		else if (diarias == 15) {
			System.out.println("A valor a ser pago é de: " + ((500 * diarias) + (10 * diarias)));
		}
		else {
			System.out.println("A valor a ser pago é de: " + ((500 * diarias) + (5 * diarias)));
		}
		System.out.println("Gostaria de continuar?");
		confirma = input.next();
		
	} while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
	}

}