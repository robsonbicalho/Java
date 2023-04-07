import javax.swing.JOptionPane;
public class CalculaSalariosMinimos {

	public static void main(String[] args) {
		
		String sminimo = JOptionPane.showInputDialog(null, "Informe o valor atual do salario minimo");
		String sfuncionario = JOptionPane.showInputDialog(null, "Informe o valor do salario");
		
		double Dsminimo = Double.parseDouble(sminimo);
		double Dsfuncionario = Double.parseDouble(sfuncionario);
		double qtsmin = Dsfuncionario /= Dsminimo;
		JOptionPane.showMessageDialog(null, "O salario informado equivale a " + qtsmin + " salarios minimos");
		

	}

}