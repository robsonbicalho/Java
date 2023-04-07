
import java.util.Scanner;
public class CalculaIdadePrintln {
	
	public static void main(String[] args) {
		Scanner anos = new Scanner(System.in);
		System.out.println("Digite o ano do seu nascimento");
		int nasc = anos.nextInt();
		System.out.println("Digite o ano atual");
		int atual = anos.nextInt();
		
		atual -= nasc;
		System.out.println("Você atualmente possui: " + atual + " anos");
		int fim = 2050;
		fim -= nasc;
		System.out.println("Em 2050 você terá: " + fim + " anos");
		
		

	}

}
