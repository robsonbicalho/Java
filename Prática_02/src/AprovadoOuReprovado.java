import java.util.Scanner;
public class AprovadoOuReprovado {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String conf;
		
		
		System.out.println("A aplicação só admite valores numéricos entre 0 e 10");
		do {
		System.out.println("Informe a primeira nota: ");
		Double nota1 = input.nextDouble();
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota invalida");
			System.out.println("Informe a primeira nota: ");
			nota1 = input.nextDouble();
		}
		System.out.println("Informe a segunda nota: ");
		Double nota2 = input.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota invalida");
			System.out.println("Informe a segunda nota: ");
			nota2 = input.nextDouble();
		}
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
		System.out.println("Gostaria de continuar? (Sim ou Não)");
		conf = input.next();
		
		} while (conf.equalsIgnoreCase("s") || conf.equalsIgnoreCase("sim"));
		System.exit(0);
		}
	}

