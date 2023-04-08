import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalculaEsferaJOP {

    public static void main(String[] args) {
        String entrada = "";
        DecimalFormat df = new DecimalFormat("0.00");
        
        do {
            String raio = JOptionPane.showInputDialog(null, "Informe o raio da esfera");

            double Draio = Double.parseDouble(raio);
            double comprimento = 2 * Math.PI * Draio;
            double area = 3.14 * Math.pow(Draio, 2);
            double volume = (Math.PI * Math.pow(Draio, 3) * 3 / 4);

            JOptionPane.showMessageDialog(null, "O comprimento vale: " + df.format(comprimento) + "\n" + "A área vale: " + df.format(area) + "\n" + "O volume vale: " + df.format(volume));
            
            int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
            if (confirma == JOptionPane.YES_OPTION) {
                entrada = "Sim";
            } else if (confirma == JOptionPane.NO_OPTION) {
                entrada = "Não";
            }
        } while (entrada.equalsIgnoreCase("Sim"));
        System.exit(0);
    }
}