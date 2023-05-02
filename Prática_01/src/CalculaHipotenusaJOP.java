import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculaHipotenusaJOP {

    public static void main(String[] args) {
        String entrada = "";
        DecimalFormat df = new DecimalFormat("0.00");
        
        do {
            String b = JOptionPane.showInputDialog(null, "Informe o valor do cateto oposto");
            String c = JOptionPane.showInputDialog(null, "Informe o valor do cateto adjacente");

            double Db = Double.parseDouble(b);
            double Dc = Double.parseDouble(c);

            double a = Math.sqrt(Math.pow(Db, 2) + Math.pow(Dc, 2));

            if (Db + Dc < a || a + Dc < Db || a + Db < Dc || Db == 0 || Dc == 0) {
                JOptionPane.showMessageDialog(null, "O triângulo não satisfaz as condições de existência");
            } else {
                JOptionPane.showMessageDialog(null, "A hipotenusa vale: " + df.format(a));
            }

            int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
            if (confirma == JOptionPane.YES_OPTION) {
                entrada = "sim";
            } else if (confirma == JOptionPane.NO_OPTION) {
                entrada = "não";
            }
        } while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
        System.exit(0);
    }

}
