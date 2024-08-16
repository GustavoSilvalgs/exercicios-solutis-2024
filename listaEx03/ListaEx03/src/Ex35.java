import java.util.Random;
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        //35. Exiba uma quantidade de números sorteados determinada pelo usuário. Peça também que
        //o usuário determine a faixa do sorteio.
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Quantia de números para o sorteio: ");
        int n = sc.nextInt();

        System.out.println("Valor de onde os números aletórios devem começar: ");
        int start = sc.nextInt();

        System.out.println("Valor de onde os números aletórios devem terminar: ");
        int end = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int randomNumber = rand.nextInt(start, end + 1);
            System.out.println(randomNumber);
        }
    }
}
