import java.util.Scanner;

public class AlunosNotas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double somanotas = 0;
        double qtalunos = 0;
        double maiorque90 = 0;
        double reprovados = 0;
        double maiornota = 0;
        double menornota = 100;
   
        System.out.print("Digite a nota final: ");
        double notafinal = input.nextDouble();
       
        
        while (notafinal >= 0) {
        	 System.out.print("Digite a quantidade de faltas: ");
             double faltas = input.nextDouble();
            if (notafinal > 90) {
            	maiorque90++;
            } 
            if (notafinal < 70 || faltas >= 20) {
            	reprovados++;
            }
            qtalunos++;
            somanotas += notafinal;
            
            if (notafinal > maiornota) {
            	maiornota = notafinal;
            }
            if (notafinal < menornota) {
            	menornota = notafinal;
            }
            System.out.print("Digite a nota final: ");
            notafinal = input.nextInt();
        }
        
        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + maiorque90);
        System.out.println("Quantidade de alunos reprovados por nota ou por falta: " + reprovados);
        System.out.println("A maior e a menor nota foram respectivamente: " + maiornota + " e " + menornota);
        System.out.println("A media total das notas da turma foi: " + (somanotas / qtalunos));
   
    }
}

