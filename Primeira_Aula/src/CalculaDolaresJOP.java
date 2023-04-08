import javax.swing.JOptionPane;

public class CalculaDolaresJOP {
    public static void main(String[] args) {
        String entrada = "";
        do {
            String CotDolar = JOptionPane.showInputDialog(null, "Digite a cotação do dólar"); 
            String QntDolar = JOptionPane.showInputDialog(null, "Digite a quantidade de dólares");
            double DCotDolar = Double.parseDouble(CotDolar);
            double DQntDolar = Double.parseDouble(QntDolar);
            double QntReais = DQntDolar *= DCotDolar;
            JOptionPane.showMessageDialog(null, QntDolar + " dolares equivalem a: " + QntReais + " Reais"); 
            
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