import javax.swing.JOptionPane;

public class PotênciaComMultiplicação {

	public static void main(String[] args) {
		int contador = 1;
		double potencia;

		String entradabase = JOptionPane.showInputDialog("Informe o valor da base: ");
		String entradaexpoente = JOptionPane.showInputDialog("Informe o valor do expoente: ");

		int base = Integer.parseInt(entradabase);
		int expoente = Integer.parseInt(entradaexpoente);
		potencia = base;

		// Potencia base negativa
		if (base < 0 && expoente > 0) {
			for (; contador < expoente; contador++) {
				potencia *= base;
				potencia = -potencia;
				if (expoente % 2 == 0) {
					potencia = -potencia;
				}
			}
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: " + potencia);
			System.exit(0);
		} else if (base < 0 && expoente == 0) {
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: 1");
			System.exit(0);
		} else if (base < 0 && expoente < 0) {
			expoente = -expoente;
			for (; contador < expoente; contador++) {
				potencia *= base;
			}
			potencia = 1 / potencia;
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: " + potencia);
		}

		// Potencia base positiva
		if (base > 0 && expoente > 0) {
			for (; contador < expoente; contador++) {
				potencia *= base;
			}
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: " + potencia);
			System.exit(0);
		} else if (base > 0 && expoente == 0) {
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: 1");
			System.exit(0);
		} else if (base > 0 && expoente < 0) {
			expoente = -expoente;
			for (; contador < expoente; contador++) {
				potencia *= base;
			}
			potencia = 1 / potencia;
			JOptionPane.showMessageDialog(null, base + " elevado por " + expoente + " é igual a: " + potencia);
		}
	}
}
