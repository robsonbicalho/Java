import javax.swing.JOptionPane;

public class CalculaIdade2050JOP {
	
	public static void main(String[] args) {
		String entrada = "";
		
		do {
			String InNasc = JOptionPane.showInputDialog(null, "Digite sua data de nascimento");
			String InAtual = JOptionPane.showInputDialog(null, "Digite o ano atual");
			double  DtNasc = Double.parseDouble(InNasc);
			double DtAtual = Double.parseDouble(InAtual);
			
			DtAtual -= DtNasc;
			int fim = 2050;
			fim -= DtNasc;
			JOptionPane.showMessageDialog(null, "Você atualmente possui: " + DtAtual + " anos" + "\n" + "Em 2050 você terá: " + fim + " anos");
			
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
