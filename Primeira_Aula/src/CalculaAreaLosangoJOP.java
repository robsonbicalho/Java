import javax.swing.JOptionPane;
public class CalculaAreaLosango {

	public static void main(String[] args) {
		
		String DMaior = JOptionPane.showInputDialog(null, "Informe a diagonal maior do losango");
		String DMenor = JOptionPane.showInputDialog(null, "Informe a diagonal menor do losango");
	
		double DDMaior = Double.parseDouble(DMaior);
		double DDMenor = Double.parseDouble(DMenor);
		
		double AreaLosango = (DDMaior * DDMenor) / 2;
		JOptionPane.showMessageDialog(null, "Area do losango: " + AreaLosango);
	
	}

}
