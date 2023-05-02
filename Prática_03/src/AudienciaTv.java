import javax.swing.JOptionPane; 
import java.text.DecimalFormat;
public class AudienciaTv {

	public static void main(String[] args) {
		String entrada;
		DecimalFormat df = new DecimalFormat("0.00");
		double total = 0;
		double  canal2 = 0;
		double  canal4 = 0;
		double  canal5 = 0;
		double  canal7 = 0;
		double  canal12 = 0;
		int canal;
		
	    do {   
		do {
			entrada = JOptionPane.showInputDialog("Informe o número do canal (2, 4, 5, 7 ou 12): ");
	        canal =  Integer.parseInt(entrada); 

	    if (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {
	    	JOptionPane.showMessageDialog(null, "Canal inválido. Digite um canal válido.");
	    }
	        } while (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12);
		
		while (canal > 0) {
			entrada = JOptionPane.showInputDialog("Informe quantas pessoas estavam assistindo ao canal: ");
			int pessoas = Integer.parseInt(entrada);
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
				entrada = JOptionPane.showInputDialog("Informe o número do canal (2, 4, 5, 7 ou 12): ");
		        canal =  Integer.parseInt(entrada);

		    if (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12) {
		    	JOptionPane.showMessageDialog(null, "Canal inválido. Digite um canal válido.");
		    }
		        } while (canal != 0 && canal != 2 && canal != 4 && canal != 5 && canal != 7 && canal != 12);
		}
		int resp = JOptionPane.showConfirmDialog(null, "A porcentagem de pessoas assistindo ao canal 2 era de: " + df.format((canal2 / total) * 100) + "%" + "\n" +
				"A porcentagem de pessoas assistindo ao canal 4 era de: " + df.format((canal4 / total) * 100) + "%" + "\n" +
				"A porcentagem de pessoas assistindo ao canal 5 era de: " + df.format((canal5 / total) * 100) + "%" + "\n" +
				"A porcentagem de pessoas assistindo ao canal 7 era de: " + df.format((canal7 / total) * 100) + "%" + "\n" +
				"A porcentagem de pessoas assistindo ao canal 12 era de: " + df.format((canal12 / total) * 100) + "%" + "\n" + "\n" +
				"Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
				entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION)
				entrada = "não";
	    	} while (entrada.equalsIgnoreCase("sim"));
	    	System.exit(0);
				

	}

}
