import java.util.Scanner;
public class CobrançaAcademia {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Selecione o sexo (1 ou 2)");
		System.out.println("1 - Feminino");
		System.out.println("2 - Masculino");
		int genero = input.nextInt();
		String confirma;
		
		do {
		System.out.println("Informe a idade: ");
		int idade = input.nextInt();
		
		switch (genero) {
		case 1:
			if (idade <= 18) {
				System.out.println("A mensalidade a ser paga será de R$60,00");
			}
			else if (idade > 19 && idade <= 25) {
				System.out.println("A mensalidade a ser paga será de R$90,00");
			}
			else if (idade > 26 && idade <= 40) {
				System.out.println("A mensalidade a ser paga será de R$85,00");
			}
			else {
				System.out.println("A mensalidade a ser paga será de R$80,00");
			}
			break;
		case 2:
			if (idade <= 15) {
				System.out.println("A mensalidade a ser paga será de R$60,00");
			}
			else if (idade > 16 && idade <= 18) {
				System.out.println("A mensalidade a ser paga será de R$75,00");
			}
			else if (idade > 19 && idade <= 30) {
				System.out.println("A mensalidade a ser paga será de R$90,00");
			}
			else if (idade > 31 && idade <= 50) {
				System.out.println("A mensalidade a ser paga será de R$85,00");
			}
			else {
				System.out.println("A mensalidade a ser paga será de R$80,00");
			}
			break;
		default:
			System.out.println("Informações invalidas");
			break;
		}
			System.out.println("Gostaria de continuar? (Sim ou Não)");
			confirma = input.next();
			
		}while (confirma.equalsIgnoreCase("sim") || confirma.equalsIgnoreCase("s"));
		System.exit(0);
	}
}