import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de homens na turma :");
        int quantidadeHomens = sc.nextInt();

        System.out.print("Informe a quantidade de homens na turma :");
        int quantidadeMulheres = sc.nextInt();

        int totalEstudantes = quantidadeHomens + quantidadeMulheres;

        double percentualHomens = ((double) quantidadeHomens / totalEstudantes) * 100;

        double percentualMulheres = ((double) quantidadeMulheres / totalEstudantes) * 100;

        System.out.printf("Percentual de homens: %.2f%% \n", percentualHomens);

        System.out.printf("Percentual de mulheres: %.2f%%", percentualMulheres);

        sc.close();
    }
}
