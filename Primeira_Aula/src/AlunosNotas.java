import java.util.Scanner;

public class AlunosNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int qtdAprovados = 0;
        int qtdReprovados = 0;
        float somaNotas = 0;
        float maiorNota = 0;
        float menorNota = 100;
        
        while(true) {
            System.out.print("Digite a nota final (ou um valor negativo para sair): ");
            float nota = sc.nextFloat();
            if(nota < 0) {
                break;
            }
            System.out.print("Digite o total de faltas: ");
            int faltas = sc.nextInt();
            
            if(nota >= 90) {
                qtdAprovados++;
            } else if(nota < 70 || faltas >= 20) {
                qtdReprovados++;
            }
            
            somaNotas += nota;
            
            if(nota > maiorNota) {
                maiorNota = nota;
            }
            
            if(nota < menorNota) {
                menorNota = nota;
            }
        }
        
        float mediaNotas = somaNotas / (qtdAprovados + qtdReprovados);
        
        System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + qtdAprovados);
        System.out.println("Quantidade de alunos reprovados por nota ou por falta: " + qtdReprovados);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média de notas da turma: " + mediaNotas);
        
        sc.close();
    }
}