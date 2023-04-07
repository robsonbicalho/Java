import javax.swing.JOptionPane;
public class CalculaSalariosMinimosJOP {

	public static void main(String[] args) {
		
		String sminimo = JOptionPane.showInputDialog(null, "Informe o valor atual do salário mínimo");
		String sfuncionario = JOptionPane.showInputDialog(null, "Informe o valor do salário");
		
		double Dsminimo = Double.parseDouble(sminimo);
		double Dsfuncionario = Double.parseDouble(sfuncionario);
		double qtsmin = Dsfuncionario /= Dsminimo;
		JOptionPane.showMessageDialog(null, "O salário informado equivale a " + qtsmin + " salários mínimos");
		

	}

}