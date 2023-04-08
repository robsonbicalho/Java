import java.util.Scanner;
public class PesquisaPrefeitura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		double somasalario = 0;
		double somafilhos = 0;
		double qntpessoa = 0;
		
		System.out.println("Informe o salário: ");
		double salario = input.nextDouble();
		
		while (salario >= 0) {
			qntpessoa++;
			System.out.println("Informe a quantidade de filhos: ");
			int filhos = input.nextInt();
			
			somafilhos += filhos;
			somasalario += salario;
			
			System.out.println("Informe o salário: ");
			salario = input.nextDouble();
		}
		System.out.println("A média salárial da população é: " + (somasalario / qntpessoa));
		System.out.println("A média do número de filhos é: " + (somafilhos / qntpessoa));

	}

}
