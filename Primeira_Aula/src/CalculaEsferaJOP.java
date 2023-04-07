import javax.swing.JOptionPane;
public class CalculaEsfera {

	public static void main(String[] args) {
		
		String raio = JOptionPane.showInputDialog(null, "Informe o raio da esfera");
	
		double Draio = Double.parseDouble(raio);
		double comprimento = 2 * Math.PI * Draio;
		double area = 3.14 * Math.pow(Draio, 2);
		double volume = (Math.PI * Math.pow(Draio, 3) * 3 / 4);
		
		JOptionPane.showMessageDialog(null, "O comprimento vale: " + comprimento);
		JOptionPane.showMessageDialog(null, "A area vale: " + area);
		JOptionPane.showMessageDialog(null, "O volume vale: " + volume);
	}

}
