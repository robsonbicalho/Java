import javax.swing.JOptionPane;
public class CalculaAumentoJOP {

	public static void main(String[] args) {
	
		String salario = JOptionPane.showInputDialog(null, "Informe seu salário");
		
		Double Dsalario = Double.parseDouble(salario);
		double aumento = Dsalario / 100 * 25 + Dsalario;
		JOptionPane.showMessageDialog(null, "Seu novo salário: " + aumento);
		
	}

}