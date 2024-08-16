import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        //39. Verifique se um número é perfeito, ou seja, se a soma dos seus divisores (exceto o próprio
        //número) é igual a ele mesmo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número e veja se ele é perfeito: ");
        int n = sc.nextInt();
        int divisores = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                divisores+=i;
            }

        }
        if (divisores  == n) {
            System.out.println(n+ " É perfeito");
        }else {
            System.out.println(n + " Não é perfeito");
        }
    }
}
