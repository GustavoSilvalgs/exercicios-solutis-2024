
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um dia:");
        int day = sc.nextInt();
        System.out.println("Digite um mês:");
        int month = sc.nextInt();
        System.out.println("Digite um ano:");
        int year = sc.nextInt();

        boolean isValidDate = validateDate(day, month, year);

        if (isValidDate) {
            System.out.println("Essa data é válida.");
        } else {
            System.out.println("Essa data é inválida.");
        }

        sc.close();
    }
    public static boolean validateDate(int day, int month, int year) {
        int[] daysInMonth = new int[12];

        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        } else {
            daysInMonth[1] = 28;
        }

        daysInMonth[0] = 31;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 30;
        daysInMonth[6] = 31;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;

        if (month < 1 || month > 12) {
            return false;
        }

        if (day < 1 || day > daysInMonth[month - 1]) {
            return false;
        }

        return true;
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}
