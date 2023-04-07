import javax.swing.JOptionPane;
public class CalculaDolaresJOP {

	public static void main(String[] args) {
		
		String CotDolar = JOptionPane.showInputDialog(null, "Digite a cotação do dólar"); 
		String QntDolar = JOptionPane.showInputDialog(null, "Digite a quantidade de dólares");
		
		double DCotDolar = Double.parseDouble(CotDolar);
		double DQntDolar = Double.parseDouble(QntDolar);
		double QntReais = DQntDolar *= DCotDolar;
		JOptionPane.showMessageDialog(null, "Você possui: " + QntReais + " Reais"); 
		

	}

}
