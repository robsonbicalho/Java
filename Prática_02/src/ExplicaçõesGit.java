import javax.swing.JOptionPane;

public class Explica��esGit {

    public static void main(String[] args) {
    	String entrada = "";
    	
    	do {
        String comando = JOptionPane.showInputDialog(null, "Digite um comando Git (clone, fetch ou pull): ");
        switch (comando) {
        case "git clone":
        case "clone":
        	JOptionPane.showMessageDialog(null, "git clone: cria uma c�pia local de um reposit�rio remoto.\n\nExemplo: git clone https://github.com/user/repo.git");
        break;
        case "git fetch":
        case "fetch":
        	JOptionPane.showMessageDialog(null, "git fetch: atualiza as refer�ncias locais com base em um reposit�rio remoto, mas n�o faz a mesclagem com as altera��es locais.\n\nExemplo: git fetch origin");
        break;
        case "git pull":
        case "pull":
        	JOptionPane.showMessageDialog(null, "git pull: busca as altera��ees de um reposit�rio remoto e faz a mesclagem com as altera��es locais.\n\nExemplo: git pull origin main");
        break;
        default:
            JOptionPane.showMessageDialog(null, "Comando inv�lido.");
        }
        int confirma = JOptionPane.showConfirmDialog(null, "Gostaria de ler outra explica��o");
        if (confirma == JOptionPane.YES_OPTION) {
			entrada = "sim";
        }
		else if (confirma == JOptionPane.NO_OPTION) {
			entrada = "n�o";
		}
		} while (entrada.equalsIgnoreCase("sim"));
    	System.exit(0);
	}
    }

