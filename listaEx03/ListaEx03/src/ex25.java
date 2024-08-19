
import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as horas:");
        int hours = sc.nextInt();
        System.out.println("Digite os minutos:");
        int minutes = sc.nextInt();
        System.out.println("Digite os segundos:");
        int seconds = sc.nextInt();

        boolean validTime = toValidTime(hours, minutes, seconds);

        if (validTime) {
            System.out.println("O horário é válido.");
        } else {
            System.out.println("O horário é inválido.");
        }

        sc.close();
    }

    public static boolean toValidTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23) {
            return false;
        }

        if (minutes < 0 || minutes > 59) {
            return false;
        }

        if (seconds < 0 || seconds > 59) {
            return false;
        }

        return true;
    }
}