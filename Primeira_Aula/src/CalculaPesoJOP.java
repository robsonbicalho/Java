import javax.swing.JOptionPane;
public class CalculaPesoJOP {

	public static void main(String[] args) {
		
		String peso = JOptionPane.showInputDialog(null, "Informe o peso");
		
		double Dpeso = Double.parseDouble(peso);
		double pengordou = (Dpeso / 100) * 15 + Dpeso;
		double pemagreceu = (Dpeso / 100) * 20 + Dpeso;
		JOptionPane.showMessageDialog(null, "Caso haja uma perda de 20%, o novo peso será de: " + pemagreceu + "KG");
		JOptionPane.showMessageDialog(null, "Caso haja um ganho de 15%, o novo peso será de: " + pengordou + "KG");
		
	}
}