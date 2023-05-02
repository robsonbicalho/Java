import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int linha = 5;
		final int coluna = 5;
		int matriz[][] = new int[linha][coluna];

		System.out.println("Informe os elementos da matriz:");

		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				matriz[l][c] = input.nextInt();
			}
		}

		System.out.println("\n" + "Matriz informada:");
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\n"
				+ "Elementos armazenados nas posi��es em que o �ndice da linha � par e o �ndice da coluna � �mpar");
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				if (l % 2 == 0 && c % 2 != 0) {
					// "\033[32m" � o c�digo de cor verde e "\033[0m" � o c�digo para voltar ao
					// estilo padr�o
					System.out.print("\033[32m" + matriz[l][c] + "\033[0m" + " ");
				} else {
					System.out.print(matriz[l][c] + " ");
				}
			}
			System.out.println(); //
		}
		System.out.println("\n" + "A matriz transposta da matriz informada: ");
		for (int c = 0; c < coluna; c++) {
			for (int l = 0; l < linha; l++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\n"
				+ "Matriz com a troca dos elementos da diagonal principal pelos elementos da diagonal secund�ria:");
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				if (l == c) {
					int dprincipal = matriz[l][c];
					matriz[l][c] = matriz[l][coluna - c - 1];
					matriz[l][coluna - c - 1] = dprincipal;
				}
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}

	}
}
