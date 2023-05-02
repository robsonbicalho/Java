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
				+ "Elementos armazenados nas posições em que o índice da linha é par e o índice da coluna é ímpar");
		for (int l = 0; l < linha; l++) {
			for (int c = 0; c < coluna; c++) {
				if (l % 2 == 0 && c % 2 != 0) {
					// "\033[32m" é o código de cor verde e "\033[0m" é o código para voltar ao
					// estilo padrão
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
				+ "Matriz com a troca dos elementos da diagonal principal pelos elementos da diagonal secundária:");
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
