import java.util.Scanner;
public class AprovadoReprovadoExame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("A aplicação só admite valores numéricos entre 0 e 10");
		System.out.println("Informe três notas: ");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		double nota3 = input.nextDouble();
		
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
	}

}
