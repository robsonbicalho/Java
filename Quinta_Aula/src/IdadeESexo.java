import javax.swing.JOptionPane;

public class IdadeESexo {

	public static void main(String[] args) {
		int contador = 1;
		int contadorSexoIdade = 0;

		for (; contador <= 10; contador++) {
			String entradaidade = JOptionPane.showInputDialog("Informe a idade da " + contador + "ª pessoa: ");
			int idade = Integer.parseInt(entradaidade);
			while (idade < 0) {
				JOptionPane.showMessageDialog(null, "Idade inválida, digite novamente: ");
				entradaidade = JOptionPane.showInputDialog("Informe a idade da " + contador + "ª pessoa: ");
				idade = Integer.parseInt(entradaidade);
			}

			String sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m) da " + contador + "ª pessoa: ");
			while (sexo.equalsIgnoreCase("f") == false && sexo.equalsIgnoreCase("m") == false) {
				JOptionPane.showMessageDialog(null, "Sexo inválido, digite novamente: ");
				sexo = JOptionPane.showInputDialog("Informe o sexo (f ou m): ");
			}

			if (idade >= 20 && idade <= 40 && sexo.equalsIgnoreCase("f")) {
				contadorSexoIdade++;

			}
		}

		JOptionPane.showMessageDialog(null, "A quantidade de pessoas do sexo feminino que tem entre 20 e 40 anos é de: ");

	}
}
