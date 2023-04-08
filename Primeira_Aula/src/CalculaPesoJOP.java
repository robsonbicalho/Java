import javax.swing.JOptionPane;

public class CalculaPesoJOP {

	public static void main(String[] args) {
		
		String entrada = "";
		
		do {
			String peso = JOptionPane.showInputDialog(null, "Informe o peso");
		
			double Dpeso = Double.parseDouble(peso);
			double pengordou = (Dpeso / 100) * 15 + Dpeso;
			double pemagreceu = Dpeso - (Dpeso / 100) * 20;
			JOptionPane.showMessageDialog(null, "Caso haja uma perda de 20%, o novo peso será de: " + pemagreceu + "KG" + "\n" +
												"Caso haja um ganho de 15%, o novo peso será de: " + pengordou + "KG");
			
			int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
			if (confirma == JOptionPane.YES_OPTION) {
				entrada = "sim";
			}
			else if (confirma == JOptionPane.NO_OPTION) {
				entrada = "não";
			}
		} while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
		
		System.exit(0);
	}
}
