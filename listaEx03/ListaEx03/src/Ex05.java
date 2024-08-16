import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Digite o valor inicial do débito: ");
        double valorInicial = sc.nextDouble();
        System.out.print("Digite a quantidade de meses: ");
        double quantidadeMeses = sc.nextDouble();
        System.out.print("Digite a taxa de juros mensais: ");
        double jurosMensais = sc.nextDouble();

        double calculoJurosSimples = valorInicial * (jurosMensais / 100) * quantidadeMeses;

        double valorFinal = valorInicial + calculoJurosSimples;

        System.out.printf("Sua dívida é: R$ %.2f%n", valorFinal);

        sc.close();


    }
}
