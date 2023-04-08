import javax.swing.JOptionPane;

public class CalculaFahrenheitJOP {

    public static void main(String[] args) {
        String entrada = "";
        do {
            String celsius = JOptionPane.showInputDialog(null, "Informe a temperatura em Celsius");
            double Dcelsius = Double.parseDouble(celsius);
            double fahrenheit = (Dcelsius * 9 / 5) + 32;
            JOptionPane.showMessageDialog(null, celsius + " graus celsius equivalem a " + fahrenheit + " graus fahrenheit");

            int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de continuar? (Sim ou Não)");
            if (confirma == JOptionPane.YES_OPTION) {
                entrada = "Sim";
            } else if (confirma == JOptionPane.NO_OPTION) {
                entrada = "Não";
            }
        } while (entrada.equalsIgnoreCase("Sim") || entrada.equalsIgnoreCase("S"));
        System.exit(0);
    }

}