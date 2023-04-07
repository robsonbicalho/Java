import javax.swing.JOptionPane;
public class CalculaDolar {

	public static void main(String[] args) {
		
		String CotDolar = JOptionPane.showInputDialog(null, "Digite a cotacao do dolar"); 
		String QntDolar = JOptionPane.showInputDialog(null, "Digite a quantidade de dolares");
		
		double DCotDolar = Double.parseDouble(CotDolar);
		double DQntDolar = Double.parseDouble(QntDolar);
		double QntReais = DQntDolar *= DCotDolar;
		JOptionPane.showMessageDialog(null, "Voce possui: " + QntReais + " Reais"); 
		

	}

}
