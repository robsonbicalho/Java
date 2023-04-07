import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Informe o peso em quilogramas: ");
		double peso = input.nextDouble();
		System.out.println("Informe a altura em metros: ");
		double altura = input.nextDouble();
		
		double imc = peso/(Math.pow(altura, 2)); 
		
		if (imc < 20) {
			System.out.println("Índividuo abaixo do peso");
		}
		else if (imc >= 20 && imc < 25) {
			System.out.println("Índividuo com peso ideal");
		}
		else if (imc >= 25 && imc < 30) {
		System.out.println("Índividuo com sobrepeso");
		}
		else if (imc >= 30 && imc < 40) {
			System.out.println("Índividuo com obesidade");
		}
		else {
			System.out.println("Índividuo com obesidade morbida");
		}
	}

}
