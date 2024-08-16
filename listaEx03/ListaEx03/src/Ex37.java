import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        // 37. Calcule o fatorial de um número.
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int n = sc.nextInt();

        int fatorial = 1; // Start with 1 because multiplying by 0 will result in 0

        // Calculate the factorial by multiplying numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " é: " + fatorial);
    }
}
