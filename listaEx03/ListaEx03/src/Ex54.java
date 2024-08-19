import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        //54. Apresente uma tabela de conversão de reais
        // em dólares. Ela deve ser totalmente
        //configurável, ou seja o usuário pode
        // informar o valor inicial e final, o valor de incremento e o
        //valor de 1 dólar. Apresente os números no formato monetário com duas casas decimais.

        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE O VALOR INICIAL: ");
        double valorInicial = sc.nextDouble();

        System.out.print("DIGITE O VALOR FINAL: ");
        double valorFinal = sc.nextDouble();

        System.out.print("DIGITE O VALOR DE INCREMENTO: ");
        double valorIncremento = sc.nextDouble();

        System.out.println("DIGITE O VALOR DO DOLAR");
        double valorDolar = sc.nextDouble();


        System.out.printf("|  REAL |  DOLAR |\n");
        for (double real = valorInicial; real <= valorFinal; real += valorIncremento) {

            System.out.printf("| %.2f | %.2f |\n", real, real / valorDolar);
        }
    }
}
