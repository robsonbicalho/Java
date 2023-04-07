import javax.swing.JOptionPane;
public class CalculaAumento {

	public static void main(String[] args) {
	
		String salario = JOptionPane.showInputDialog(null, "Informe seu salario");
		
		Double Dsalario = Double.parseDouble(salario);
		double aumento = Dsalario / 100 * 25 + Dsalario;
		JOptionPane.showMessageDialog(null, "Seu novo salario: " + aumento);
		
	}

}