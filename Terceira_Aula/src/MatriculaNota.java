import java.util.Scanner;
public class MatriculaNota {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a matrícula: ");
		int matricula = input.nextInt();
		
		while (matricula >=0) {
			System.out.println("Informe as três notas: ");
			double nota1 = input.nextInt();
			double nota2 = input.nextInt();
			double nota3 = input.nextInt();
			
			double media = (nota1 + nota2 + nota3)/3;
			
			 if (media >= 70.0) {
	                System.out.println("Aluno aprovado!");
	         } 
			 else if (media >= 60.0) {
	                System.out.println("Aluno em recuperação!");
	         } 
			 else {
	                System.out.println("Aluno reprovado!");
	         }
			 
			 System.out.println("Informe a matrícula: ");
				matricula = input.nextInt();
				
		}
		System.out.println("Programa encerrado");
	}

}


