import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        //50. Imprima exatamente o n-ezimo termo da seqüência de Fibonacci.
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a posição do elemento da sequência de Fibonacci você deseja encontrar? ");
        int n = sc.nextInt();
        long[] fibo = new long[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.println("O termo da posição escolhida é o " + fibo[n]);

        sc.close();
    }
}
