import javax.swing.JOptionPane;

public class CalculaAreaLosangoJOP {

	public static void main(String[] args) {
		String entrada = "";
		do {
			String DMaior = JOptionPane.showInputDialog(null, "Informe a diagonal maior do losango");
			String DMenor = JOptionPane.showInputDialog(null, "Informe a diagonal menor do losango");
		
			double DDMaior = Double.parseDouble(DMaior);
			double DDMenor = Double.parseDouble(DMenor);
			
			double AreaLosango = (DDMaior * DDMenor) / 2;
			JOptionPane.showMessageDialog(null, "Área do losango: " + AreaLosango);
			
			int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
			if (confirma == JOptionPane.YES_OPTION) {
				entrada = "sim";
			}
			else if (confirma == JOptionPane.NO_OPTION) {
				entrada = "não";
			}
		} while (entrada.equalsIgnoreCase("sim") || entrada.equalsIgnoreCase("s"));
		System.exit(0);
	}

}