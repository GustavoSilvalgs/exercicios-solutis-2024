
import java.time.LocalDate;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 2024;

        System.out.println("Digite o 1º nome:");
        String name1 = sc.nextLine();
        System.out.println("Digite o mês do 1º aniversário:");
        int month1 = sc.nextInt();
        System.out.println("Digite o dia do 1º aniversário:");
        int day1 = sc.nextInt();

        System.out.println("Digite o 2º nome:");
        String name2 = sc.nextLine();
        System.out.println("Digite o mês do 2º aniversário:");
        int month2 = sc.nextInt();
        System.out.println("Digite o dia do 2º aniversário:");
        int day2 = sc.nextInt();

        LocalDate data1 = LocalDate.of(year, month1, day1);
        LocalDate data2 = LocalDate.of(year, month2, day2);

        int result = data1.compareTo(data2);

        if (result < 0) {
            System.out.println(name1 + " faz aniversário primeiro.");
        } else if (result > 0) {
            System.out.println(name2 + " faz aniversário primeiro.");
        } else {
            System.out.println("Ambos fazem aniversário no mesmo dia.");
        }

        sc.close();
    }
}