import java.util.Scanner; 
import java.text.DecimalFormat;
public class AudienciaTv {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double total = 0;
		double  canal2 = 0;
		double  canal4 = 0;
		double  canal5 = 0;
		double  canal7 = 0;
		double  canal12 = 0;
		int canal;
	        
		do {
			System.out.println("Informe o número do canal (2, 4, 5, 7 ou 12): ");
	        canal = input.nextInt();

	    if (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {
	    	System.out.println("Canal inválido. Digite um canal válido.");
	    }
	        } while (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12);
		
		while (canal > 0) {
			System.out.println("Informe quantas pessoas estavam assistindo ao canal: ");
			int pessoas = input.nextInt();
			total += pessoas;
			
			if (canal == 2) {
				canal2 += pessoas;;
			}
			else if (canal == 4) {
				canal4 += pessoas;;
			}
			else if (canal == 5) {
				canal5 += pessoas;;
			}
			else if (canal == 7) {
				canal7 += pessoas;;
			}
			else if (canal == 12) {
				canal12 += pessoas;;
			}
			do {
				System.out.println("Informe o número do canal (2, 4, 5, 7 ou 12): ");
		        canal = input.nextInt();

		    if (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {
		    	System.out.println("Canal inválido. Digite um canal válido.");
		    }
		        } while (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12);
		}
		System.out.println("A porcentagem de pessoas assitindo ao canal 2 era de: " + df.format((canal2 / total) * 100) + "%");
		System.out.println("A porcentagem de pessoas assitindo ao canal 4 era de: " + df.format((canal4 / total) * 100) + "%");
		System.out.println("A porcentagem de pessoas assitindo ao canal 5 era de: " + df.format((canal5 / total) * 100) + "%");
		System.out.println("A porcentagem de pessoas assitindo ao canal 7 era de: " + df.format((canal7 / total) * 100) + "%");
		System.out.println("A porcentagem de pessoas assitindo ao canal 12 era de: " + df.format((canal12 / total) * 100) + "%");

	}

}
