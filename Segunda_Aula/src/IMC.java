import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {
    	String entrada = "";
    	
    	do {
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso em quilogramas:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura em metros:"));
        double imc = peso / (Math.pow(altura, 2));

        if (imc < 20) {
            JOptionPane.showMessageDialog(null, "Índividuo abaixo do peso");
        } else if (imc >= 20 && imc < 25) {
            JOptionPane.showMessageDialog(null, "Índividuo com peso ideal");
        } else if (imc >= 25 && imc < 30) {
            JOptionPane.showMessageDialog(null, "Índividuo com sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            JOptionPane.showMessageDialog(null, "Índividuo com obesidade");
        } else {
            JOptionPane.showMessageDialog(null, "Índividuo com obesidade morbida");
        }
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