import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ValorDaFunção {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        String entrada = "";

        do {
        String input = JOptionPane.showInputDialog("Informe um valor qualquer:");
        double x = Double.parseDouble(input);

        if (x < -2) {
            JOptionPane.showMessageDialog(null, "O valor da função é: " + df.format(2 * x + 2));
        }
        else if (x >= -2 && x < 3) {
            JOptionPane.showMessageDialog(null, "O valor da função é: " + df.format(x * 0 + 3));
        }
        else {
            JOptionPane.showMessageDialog(null, "O valor da função é: " + df.format(-x));
        }
        int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de calcular outro valor? (Sim ou Não)");
        if (confirma == JOptionPane.YES_OPTION) {
        	entrada = "sim";
        }
        else if (confirma == JOptionPane.NO_OPTION) {
        	entrada = "não";
        }
    } while (entrada.equalsIgnoreCase("sim") || entrada.equalsIgnoreCase("s"));
        System.exit(0);
}
}