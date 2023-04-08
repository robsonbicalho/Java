import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PesquisaPrefeitura {

	public static void main(String[] args) {
		String entrada;
		DecimalFormat df = new DecimalFormat("0.00");
		
		double somasalario = 0;
		double somafilhos = 0;
		double qntpessoa = 0;
		
		do {
		entrada = JOptionPane.showInputDialog("Informe o salário: ");
		double salario = Double.parseDouble(entrada);
		
		while (salario >= 0) {
			qntpessoa++;
			entrada = JOptionPane.showInputDialog("Informe a quantidade de filhos: ");
			int filhos = Integer.parseInt(entrada);
			
			somafilhos += filhos;
			somasalario += salario;
			
			entrada = JOptionPane.showInputDialog("Informe o salário: ");
			salario = Double.parseDouble(entrada);
		}
		int resp = JOptionPane.showConfirmDialog(null, "A média salárial da população é: " + df.format(somasalario / qntpessoa) + "\n" + 
		"A média do número de filhos é: " + df.format(somafilhos / qntpessoa) + "\n" + "\n" + "Deseja continuar?");
		if (resp == JOptionPane.YES_OPTION)
			entrada = "sim";
		else if (resp == JOptionPane.NO_OPTION)
			entrada = "não";
		} while (entrada.equalsIgnoreCase("sim"));
    	System.exit(0);
	}

}
