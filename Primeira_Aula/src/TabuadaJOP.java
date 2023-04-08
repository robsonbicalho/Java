import javax.swing.JOptionPane;

public class TabuadaJOP {
    public static void main(String[] args) {
        String entrada = "";
        do {
            String numero = JOptionPane.showInputDialog(null, "Informe um número: ");

            double Dnumero = Double.parseDouble(numero);
            int x = 0;
            String tabuada = "";
            while (x <= 10) {
                double resultado = Dnumero * x;
                tabuada += numero + " X " + x + " = " + resultado + "\n";
                x++;
            }
            JOptionPane.showMessageDialog(null, tabuada);
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