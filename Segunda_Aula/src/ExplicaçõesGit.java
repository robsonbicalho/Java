import javax.swing.JOptionPane;

public class ExplicaçõesGit {

    public static void main(String[] args) {
        String comando = JOptionPane.showInputDialog(null, "Digite um comando Git (clone, fetch ou pull): ");

        switch (comando) {
        case "git clone":
        	JOptionPane.showMessageDialog(null, "git clone: cria uma cópia local de um repositório remoto.\n\nExemplo: git clone https://github.com/user/repo.git");
        break;
        case "git fetch":
        	JOptionPane.showMessageDialog(null, "git fetch: atualiza as referências locais com base em um repositório remoto, mas não faz a mesclagem com as alterações locais.\n\nExemplo: git fetch origin");
        break;
        case "git pull":
        	JOptionPane.showMessageDialog(null, "git pull: busca as alteraçõees de um repositório remoto e faz a mesclagem com as alterações locais.\n\nExemplo: git pull origin main");
        break;
        default:
            JOptionPane.showMessageDialog(null, "Comando inválido.");
        }
    }

}