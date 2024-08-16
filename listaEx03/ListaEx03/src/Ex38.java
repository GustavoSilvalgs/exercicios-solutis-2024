import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        //38. Verifique se um número é primo ou não.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero e confira se ele é primo: ");
        int num = sc.nextInt();
        if (isPrime(num)){
            System.out.println(num + " É primo");
        }
        else {
            System.out.println(num + " Não é primo");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        if (n  == 2 || n == 3 ) {
            return false;
        }
        if (n  % 2 == 0 || n % 3 == 0 ) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6 ) {
            if (n % i == 0 || n % (i + 2) == 0 ) {
                return false;
            }
        }
        return true;
    }
}
