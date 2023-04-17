import javax.swing.JOptionPane;

public class IdadeEPeso {

	public static void main(String[] args) {
		int contador = 1;
		int contadorSexoPesoF = 0;
		int contadorSexoPesoM = 0;

		String mensagem1 = "A quantidade de pessoas do sexo feminino que pesa entre 50kg e 70kg é de: ";
		String mensagem2 = "A quantidade de pessoas do sexo masculino que pesa entre 60kg e 80kg é de: ";
		for (; contador <= 10; contador++) {
			String entradapeso = JOptionPane.showInputDialog("Informe o peso da " + contador + "ª pessoa: ");
			int peso = Integer.parseInt(entradapeso);
			while (peso < 0) {
				JOptionPane.showMessageDialog(null, "Peso inválido, digite novamente: ");
				entradapeso = JOptionPane.showInputDialog("Informe o peso da " + contador + "ª pessoa: ");
				peso = Integer.parseInt(entradapeso);
			}

			String sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m) da " + contador + "ª pessoa: ");
			while (sexo.equalsIgnoreCase("f") == false && sexo.equalsIgnoreCase("m") == false) {
				JOptionPane.showMessageDialog(null, "Sexo inválido, digite novamente: ");
				sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m): ");
			}

			if (peso >= 50 && peso <= 70 && sexo.equalsIgnoreCase("f")) {
				contadorSexoPesoF++;
			}
			if (peso >= 60 && peso <= 80 && sexo.equalsIgnoreCase("m")) {
				contadorSexoPesoM++;
			}
		}
		mensagem1 += contadorSexoPesoF + " ";
		mensagem2 += contadorSexoPesoM + " ";
		JOptionPane.showMessageDialog(null, mensagem1 + "\n" + mensagem2);
	}
}
