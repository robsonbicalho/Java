import javax.swing.JOptionPane;
public class MatriculaNota {

	public static void main(String[] args) {
		String entrada;
		int matricula;
		double nota1, nota2, nota3;
		
		entrada = JOptionPane.showInputDialog("Informe a matrícula: ");
		matricula = Integer.parseInt(entrada);
		
		while (matricula >=0) {
			entrada = JOptionPane.showInputDialog("Informe a primeira nota: ");
			nota1 = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Informe a segunda nota: ");
			nota2 = Double.parseDouble(entrada);
			entrada = JOptionPane.showInputDialog("Informe a terceira nota: ");
			nota3 = Double.parseDouble(entrada);
			
			double media = (nota1 + nota2 + nota3)/3;
			
			 if (media >= 70.0) {
	                JOptionPane.showMessageDialog(null, "Aluno aprovado!");
	         } 
			 else if (media >= 60.0) {
				 JOptionPane.showMessageDialog(null, "Aluno em recuperação!");
	         } 
			 else {
				 JOptionPane.showMessageDialog(null, "Aluno reprovado!");
	         }
			 
			 entrada = JOptionPane.showInputDialog("Informe a matrícula: ");
				matricula = Integer.parseInt(entrada);
				
		}
		JOptionPane.showMessageDialog(null, "Programa encerrado");
	}

}


