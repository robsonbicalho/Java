import javax.swing.JOptionPane;

public class CalculaNotasJOP {

    public static void main(String[] args) {
        String entrada = "";
        
        do {
            String nota1 = JOptionPane.showInputDialog(null, "Digite a primeira nota");
            String nota2 = JOptionPane.showInputDialog(null, "Digite a segunda nota");
            String nota3 = JOptionPane.showInputDialog(null, "Digite a terceira nota");

            double Dnota1 = Double.parseDouble(nota1);
            double Dnota2 = Double.parseDouble(nota2);
            double Dnota3 = Double.parseDouble(nota3);

            double MediaAritmetica = (Dnota1 + Dnota2 + Dnota3) / 3;

            JOptionPane.showMessageDialog(null, "Media aritmética das notas: " + MediaAritmetica);

            int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
			if (confirma == JOptionPane.YES_OPTION) {
				entrada = "sim";
			}
			else if (confirma == JOptionPane.NO_OPTION) {
				entrada = "não";
			}
		} while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
		System.exit(0);
    }
}