package BuscaSequencial;

public class MecanismosDeBuscaSequencial {

	public static int buscaSequencial(double vetor[], double v) {
		int compara��o = 0;
		for (int i = 0; i < vetor.length - 1; i++) {
			compara��o++;
			if (vetor[i] == v) {
				System.out.println("O valor foi encontrado na posi��o: " + i + "\n" + "Foram realizadas " + compara��o + " compara��es");
				return i;
			}
		}
		System.out.println("O valor n�o foi encontrado.");
		return -1;
	}

	public static int buscaSequencialSentinela(double vetor[], double v) {
		vetor[vetor.length - 1] = v; //sentinela
		int compara��o = 0;
		for (int i = 0; i < vetor.length; i++) {
			compara��o++;
			if (vetor[i] == v) {
				if (i == vetor.length - 1) { 
					System.out.println("O valor foi encontrado na sentinela." + "\n" + "Foram realizadas " + compara��o + " compara��es");
				} else {
					System.out.println("O valor foi encontrado na posi��o: " + i+ "\n" + "Foram realizadas " + compara��o + " compara��es");
				}
				return i;
			}
		}
		System.out.println("O valor n�o foi encontrado.");
		return -1;
	}
}

