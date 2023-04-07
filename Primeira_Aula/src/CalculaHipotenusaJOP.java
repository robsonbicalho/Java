import javax.swing.JOptionPane;
public class CalculaHipotenusa {

	public static void main(String[] args) {

		String b = JOptionPane.showInputDialog(null, "Informe o valor do cateto oposto");
		String c = JOptionPane.showInputDialog(null, "Informe o valor do cateto adjacente");
		
		double Db = Double.parseDouble(b);
		double Dc = Double.parseDouble(c);
				
		double a = Math.sqrt(Math.pow(Db, 2) + Math.pow(Dc, 2));
		
		if ( Db + Dc < a || a + Dc < Db || a + Db < Dc || Db == 0 || Dc == 0 )  { 
		JOptionPane.showMessageDialog(null, "O triangulo nao satisfaz as condicoes de existencia");
		}
		else { 
			JOptionPane.showMessageDialog(null, "A hipotenusa vale: " + a);
		}
	} 

}
