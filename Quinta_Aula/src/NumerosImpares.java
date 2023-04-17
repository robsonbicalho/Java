import javax.swing.JOptionPane;

public class NumerosImpares {

	public static void main(String[] args) {

		String entradanumero = JOptionPane.showInputDialog("Informe um número");
		int numero = Integer.parseInt(entradanumero);

		String mensagem = "Os números ímpares entre 1 e " + numero + " são: ";
		for (int impares = 1; impares <= numero; impares++) {
			if (impares % 2 != 0) {
				mensagem += impares + " ";
			}
		}

		JOptionPane.showMessageDialog(null, mensagem);
	}

}