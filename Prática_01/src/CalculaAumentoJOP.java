import javax.swing.JOptionPane;

public class CalculaAumentoJOP {

	public static void main(String[] args) {
		String entrada = "";
		do {
			String salario = JOptionPane.showInputDialog(null, "Informe o salário");

			Double Dsalario = Double.parseDouble(salario);
			double aumento = Dsalario / 100 * 25 + Dsalario;
			JOptionPane.showMessageDialog(null, "Salário com aumento: " + aumento);

			int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
			if (confirma == JOptionPane.YES_OPTION) {
				entrada = "sim";
			} else if (confirma == JOptionPane.NO_OPTION) {
				entrada = "não";
			}
		} while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
		System.exit(0);
	}

}