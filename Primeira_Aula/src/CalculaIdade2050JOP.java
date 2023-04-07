
import javax.swing.JOptionPane;
public class CalculaIdade {
	
	public static void main(String[] args) {
		String InNasc = JOptionPane.showInputDialog(null, "Digite sua data de nascimento");
		String InAtual = JOptionPane.showInputDialog(null, "Digite o ano atual");
		double  DtNasc = Double.parseDouble(InNasc);
		double DtAtual = Double.parseDouble(InAtual);
		
		DtAtual -= DtNasc;
		JOptionPane.showMessageDialog(null, "Voce atualmente possui: " + DtAtual + " anos");
		int fim = 2050;
		fim -= DtNasc;
		JOptionPane.showMessageDialog(null, "Em 2050 voce tera: " + fim + " anos");
		
		

	}

}
