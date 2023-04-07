import javax.swing.JOptionPane;
public class CalculaFahrenheit {

	public static void main(String[] args) {
		
		String celsius = JOptionPane.showInputDialog(null, "Informe a temperatura em Celsius");
		
		double Dcelsius = Double.parseDouble(celsius);
		double fahrenheit = (Dcelsius * 9 / 5) + 32;
		JOptionPane.showMessageDialog(null, celsius + " graus celsius equivalem a " + fahrenheit + " graus fahrenheit");
		
		

	}

}
