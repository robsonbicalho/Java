import javax.swing.JOptionPane;

public class TabuadaFor {

    public static void main(String[] args) {
        int tabuada = 1;
        int resultado = 0;

        String entradanumero = JOptionPane.showInputDialog("Informe um número");
        int numero = Integer.parseInt(entradanumero);

        String mensagem = "";
        for (; tabuada <= 10; tabuada++) {
            resultado = numero * tabuada;
            mensagem += numero + " x " + tabuada + " = " + resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, "A tabuada do " + numero + " é: \n" + mensagem);
    }

}
