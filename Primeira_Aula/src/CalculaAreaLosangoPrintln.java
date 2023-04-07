import java.util.Scanner;
public class CalculaAreaLosangoPrintln {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a diagonal maior do losango");
		double DMaior = scan.nextDouble();
		System.out.println("Informe a diagonal menor do losango");
		double DMenor = scan.nextDouble();
		
		double AreaLosango = (DMaior * DMenor) / 2;
		System.out.println("Area do losango: " + AreaLosango);
	}

}
