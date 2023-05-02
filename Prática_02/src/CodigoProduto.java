import java.util.Scanner;

public class CodigoProduto  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String confirma;

        do {
        System.out.println("Escolha um dos produtos a seguir (1 a 5)");
        System.out.println("1 - Sapato");
	    System.out.println("2 - Bolsa");
	    System.out.println("3 - Camisa");
	    System.out.println("4 - Calça");
	    System.out.println("5 - Blusa");
        int codigo = input.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("Preço: R$ 99,99");
                break;
            case 2:
                System.out.println("Preço: R$ 103,89");
                break;
            case 3:
                System.out.println("Preço: R$ 49,98");
                break;
            case 4:
                System.out.println("Preço: R$ 89,72");
                break;
            case 5:
                System.out.println("Preço: R$ 97,35");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
        System.out.println("Gostaria de conferir o valor de outro produto? (Sim ou Não)");
        confirma = input.next();
        
    } while (confirma.equalsIgnoreCase("sim") || (confirma.equalsIgnoreCase("s")));
        System.exit(0);
}
}