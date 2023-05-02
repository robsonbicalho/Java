import javax.swing.JOptionPane;

public class Algoritmo02 {
    public static void main (String args[]) {
    	 String entrada;
         int nota, salario, idade;
         String  sexo;

         do {
             entrada = JOptionPane.showInputDialog("Informe uma nota de 0 a 10: ");
             nota = Integer.parseInt(entrada);
             while (nota < 0 || nota > 10) {
             JOptionPane.showMessageDialog(null, "Dados incorretos");
             entrada = JOptionPane.showInputDialog("Informe uma nota de 0 a 10: ");
             nota = Integer.parseInt(entrada);
         	}
             
             entrada = JOptionPane.showInputDialog("Informe o salário: ");
             salario = Integer.parseInt(entrada);
             while (salario < 0) {
                 JOptionPane.showMessageDialog(null, "Dados incorretos");
                 entrada = JOptionPane.showInputDialog("Informe o salário: ");
                 salario = Integer.parseInt(entrada);
             	}

             
             sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
            
             while (!sexo.equals("f") && !sexo.equals("m")) { 
                 JOptionPane.showMessageDialog(null, "Dados incorretos");
                 sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
             	}
             
             entrada = JOptionPane.showInputDialog("Informe a idade: ");
             idade = Integer.parseInt(entrada);
             while (idade < 0) {
                 JOptionPane.showMessageDialog(null, "Dados incorretos");
                 entrada = JOptionPane.showInputDialog("Informe a idade: ");
                 idade = Integer.parseInt(entrada);
             	}
             
            int resp = JOptionPane.showConfirmDialog(null, "Os dados informados estão corretos.\n\nDeseja continuar?");
            if (resp == JOptionPane.YES_OPTION)
                entrada = "sim";
            else if (resp == JOptionPane.NO_OPTION)
                entrada = "não";
        } while (entrada.equalsIgnoreCase("sim"));
        System.exit(0);
    }
}




