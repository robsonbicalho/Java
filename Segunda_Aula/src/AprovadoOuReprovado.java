import java.util.Scanner;
public class AprovadoOuReprovado {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A aplicação só admite valores numéricos entre 0 e 10");
		System.out.println("Informe a primeira nota: ");
		Double nota1 = input.nextDouble();
		System.out.println("Informe a segunda nota: ");
		Double nota2 = input.nextDouble();
		
		Double media = (nota1 + nota2)/2; 
		
		if (media > 10) {
			System.out.println("Nota invalida");
		}
		else if (media >= 7) {
			System.out.println("Aluno aprovado");
		}
		else {
			System.out.println("Aluno reprovado");
		}
	}

}
