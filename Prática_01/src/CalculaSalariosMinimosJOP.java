import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class CalculaSalariosMinimosJOP {

    public static void main(String[] args) {
    	String entrada = "";
    	DecimalFormat df = new DecimalFormat("0.00");
    	
        do {
            String sminimo = JOptionPane.showInputDialog(null, "Informe o valor atual do salário mínimo");
            String sfuncionario = JOptionPane.showInputDialog(null, "Informe o valor do salário");

            double Dsminimo = Double.parseDouble(sminimo);
            double Dsfuncionario = Double.parseDouble(sfuncionario);
            double qtsmin = Dsfuncionario / Dsminimo;
            JOptionPane.showMessageDialog(null, "O salário informado equivale a " + df.format(qtsmin) + " salários mínimos");

            int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
            if (confirma == JOptionPane.YES_OPTION) {
                entrada = "sim";
            } else {
                entrada = "não";
            }
        } while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
        System.exit(0);
    }
}
