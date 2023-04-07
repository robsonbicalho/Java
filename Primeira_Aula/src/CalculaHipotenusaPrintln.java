import java.util.Scanner;
public class CalculadoraHipotenusa {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do cateto oposto");
		double b = scan.nextDouble();
		System.out.println("Informe o valor do cateto adjacente");
		double c = scan.nextDouble();
				
		double a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
		
		if ( b + c < a || a + c < b || a + b < c || b == 0 || c == 0 )  { 
		System.out.println("O triangulo nao satisfaz as condicoes de existencia");
		}
		else { 
			System.out.println("A hipotenusa vale: " + a);
		}
	} 

}
