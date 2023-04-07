import java.util.Scanner;
import java.text.DecimalFormat;
public class LançamentoPlaneta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0,00");
		
		System.out.println("Escolha um dos planetas a seguir (1 a 8)");
		System.out.println("1 - Mercúrio");
	    System.out.println("2 - Vênus");
	    System.out.println("3 - Terra");
	    System.out.println("4 - Marte");
	    System.out.println("5 - Júpiter");
	    System.out.println("6 - Saturno");
	    System.out.println("7 - Urano");
	    System.out.println("8 - Netuno");
	    System.out.println("9 - Plutão");
		int planeta = input.nextInt();
		
		if (planeta >= 10) {
            System.out.println("Código inválido");
            return;
		}
		
		System.out.println("Digite a velocidade inicial da bola (m/s²)");
		double velocidade = input.nextDouble();
		System.out.println("Digite o instante de tempo (s)");
		double tempo = input.nextDouble();
		
		switch (planeta) {
			case 1:
				System.out.println("A velocidade vale: " + df.format(velocidade - (3.7 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((3.7 * Math.pow(tempo, 2)/2))));
				break;
			case 2:
				System.out.println("A velocidade vale: " + df.format(velocidade - (8.8 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((8.8 * Math.pow(tempo, 2)/2))));
				break;
			case 3:
				System.out.println("A velocidade vale: " + df.format(velocidade - (9.8 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((9.8 * Math.pow(tempo, 2)/2))));
				break;
			case 4:
				System.out.println("A velocidade vale: " + df.format(velocidade - (3.8 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((3.8 * Math.pow(tempo, 2)/2))));
				break;
			case 5:
				System.out.println("A velocidade vale: " + df.format(velocidade - (26.4 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((26.4 * Math.pow(tempo, 2)/2))));
				break;
			case 6:
				System.out.println("A velocidade vale: " + df.format(velocidade - (11.5 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((11.5 * Math.pow(tempo, 2)/2))));
				break;
			case 7:
				System.out.println("A velocidade vale: " + (velocidade - (9.3 * tempo)));
				System.out.println("O tempo vale: " + ((velocidade * tempo) - ((9.3 * Math.pow(tempo, 2)/2))));
				break;
			case 8:
				System.out.println("A velocidade vale: " + df.format(velocidade - (12.2 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((12.2 * Math.pow(tempo, 2)/2))));
				break;
			case 9:
				System.out.println("A velocidade vale: " + df.format(velocidade - (0.6 * tempo)));
				System.out.println("O tempo vale: " + df.format((velocidade * tempo) - ((0.6 * Math.pow(tempo, 2)/2))));
				break;
			
			
		}

	}

}
