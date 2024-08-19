import java.util.Scanner;

public class Ex45 {

    public static void main(String[] args) {
        //45. Determine o maior valor de uma lista
        // de 100 números fornecidos pelo usuário.

        Scanner sc = new Scanner(System.in);

        final int quantidadeValores = 100;
        int maiorValor = Integer.MIN_VALUE;

        System.out.println("Digite os valores ");
        for (int i = 1; i <= quantidadeValores; i++) {
            int valor = sc.nextInt();
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor é: " + maiorValor);

        sc.close();

    }
}