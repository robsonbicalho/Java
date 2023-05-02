import java.util.Scanner;
import java.text.DecimalFormat;
public class Equação2Grau {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String confirma;
		
		do {
		System.out.println("Informe os valores de a,b,c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a == 0 && b == 0 && c == 0) {
			System.out.println("Igualdade confirmada: 0 = 0");
		}
		else if (a == 0 && b == 0 && c != 0) {
			System.out.println("Coeficientes informados incorretamente");
		}
		else if (a == 0 && b != 0) {
			System.out.println("Esta é uma equação do primeiro grau");
			System.out.println("A raiz real da equação vale: x = " + df.format((-c / b)));
		}
		else {
			System.out.println("Esta é uma equação do segundo grau");
			double delta = Math.pow(b, 2) - (4 * a * c);
			if (delta < 0) {
				System.out.println("Esta equação não possui raízes reais");
			}
			else if (delta == 0) {
				double delta0 = (-b) / (2 * a);
				System.out.println("Esta equação possui duas raízes reais iguais: " + df.format(delta0)); 
			}
			else {
				double valorx1 = (-b + Math.sqrt(delta)) / (2 * a);
				double valorx2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Esta equação possui duas raízes reais diferentes: " + df.format(valorx1) + " e " + df.format(valorx2));;
			}
		}
		System.out.println("Gostaria de realizar outro calculo? (Sim ou Não)");
		confirma = input.next();
		
	} while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
	}
}