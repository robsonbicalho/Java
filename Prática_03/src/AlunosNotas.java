import javax.swing.JOptionPane;

public class AlunosNotas {
    public static void main(String[] args) {
        String entrada;
        double somanotas = 0;
        double qtalunos = 0;
        double maiorque90 = 0;
        double reprovados = 0;
        double maiornota = 0;
        double menornota = 100;
        
        do {
            entrada = JOptionPane.showInputDialog("Digite a nota final: ");
            double notafinal = Double.parseDouble(entrada);
           
            while (notafinal >= 0) {
                entrada = JOptionPane.showInputDialog("Digite a quantidade de faltas: ");
                double faltas = Double.parseDouble(entrada);
                if (notafinal > 90) {
                    maiorque90++;
                } 
                if (notafinal < 70 || faltas >= 20) {
                    reprovados++;
                }
                qtalunos++;
                somanotas += notafinal;
                
                if (notafinal > maiornota) {
                    maiornota = notafinal;
                }
                if (notafinal < menornota) {
                    menornota = notafinal;
                }
                entrada = JOptionPane.showInputDialog("Digite a nota final: ");
                notafinal = Double.parseDouble(entrada);
            }
            
            int resp = JOptionPane.showConfirmDialog(null, "Quantidade de alunos com nota maior ou igual a 90: " + maiorque90 + "\n" + 
            		"Quantidade de alunos reprovados por nota ou por falta: " + reprovados + "\n" + 
            		"A maior e a menor nota foram respectivamente: " + maiornota + " e " + menornota + "\n" + 
            		"A media total das notas da turma foi: " + (somanotas / qtalunos) + "\n" + "\n" +
            		"Deseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("sim"));
        System.exit(0);
    }
}
