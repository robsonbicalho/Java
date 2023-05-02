import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ValorDaFun��o {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        String entrada = "";

        do {
        String input = JOptionPane.showInputDialog("Informe um valor qualquer:");
        double x = Double.parseDouble(input);

        if (x < -2) {
            JOptionPane.showMessageDialog(null, "O valor da fun��o �: " + df.format(2 * x + 2));
        }
        else if (x >= -2 && x < 3) {
            JOptionPane.showMessageDialog(null, "O valor da fun��o �: " + df.format(x * 0 + 3));
        }
        else {
            JOptionPane.showMessageDialog(null, "O valor da fun��o �: " + df.format(-x));
        }
        int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de calcular outro valor? (Sim ou N�o)");
        if (confirma == JOptionPane.YES_OPTION) {
        	entrada = "sim";
        }
        else if (confirma == JOptionPane.NO_OPTION) {
        	entrada = "n�o";
        }
    } while (entrada.equalsIgnoreCase("sim") || entrada.equalsIgnoreCase("s"));
        System.exit(0);
}
}