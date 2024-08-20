
import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro valor:");
        int num3 = sc.nextInt();

        if (num1 == num2 && num2 == num3) {
            System.out.println("Todos os números são iguais.");
        } else {
            int max = num1;
            if (num2 > max) {
                max = num2;
            }
            if (num3 > max) {
                max = num3;
            }
            System.out.println("O maior número é: " + max);
        }
    }
}