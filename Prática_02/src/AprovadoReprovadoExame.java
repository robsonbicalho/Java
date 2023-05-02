import java.util.Scanner;
public class AprovadoReprovadoExame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String confirma;
		
		System.out.println("A aplicação só admite valores numéricos entre 0 e 10");
		do {
		System.out.println("Informe a primeira nota: ");
		double nota1 = input.nextDouble();
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Nota invalida. Digite novamente: ");
			nota1 = input.nextDouble();
		}
		System.out.println("Informe a segunda nota: ");
		double nota2 = input.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
			System.out.println("Nota invalida. Digite novamente: ");
			nota2 = input.nextDouble();
		}
		System.out.println("Informe a terceira nota: ");
		double nota3 = input.nextDouble();
		while (nota3 < 0 || nota3 > 11) {
			System.out.println("Nota invalida. Digite novamente: ");
			nota3 = input.nextDouble();
		}
		
		double media = (nota1 + nota2 + nota3)/3;
		
		if (media < 0 || media > 10) {
			System.out.println("Nota invalida");
		}
		else if(media < 3) {
			System.out.println("O aluno foi reprovado");
		}
		else if (media >= 3 && media < 7) {
			System.out.println("O aluno deverá fazer o exame");
		}
		else {
			System.out.println("O aluno foi aprovado");
		}
		System.out.println("Gostaria de continuar? (Sim ou Não)");
		confirma = input.next();
		
		} while (confirma.equalsIgnoreCase("Sim") || confirma.equalsIgnoreCase("S"));
		System.exit(0);
	}

}