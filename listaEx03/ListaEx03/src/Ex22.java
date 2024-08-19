import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia da primeira data de aniversário: ");
        int dia1 = scanner.nextInt();

        System.out.print("Digite o número do mês da primeira data de aniversário: ");
        int mes1 = scanner.nextInt();

        System.out.print("Digite o número do dia da segunda data de aniversário: ");
        int dia2 = scanner.nextInt();

        System.out.print("Digite o número do mês da segunda data de aniversário: ");
        int mes2 = scanner.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As datas de aniversário são iguais.");
        } else {
            System.out.println("As datas de aniversário não são iguais.");
        }

        scanner.close();
    }
}