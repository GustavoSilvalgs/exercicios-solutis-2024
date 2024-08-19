
import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro horário (HH:MM:SS): ");
        String time1 = sc.nextLine();
        System.out.println("Digite o segundo horário (HH:MM:SS): ");
        String time2 = sc.nextLine();

        int seconds1 = convertToSeconds(time1);
        int seconds2 = convertToSeconds(time2);

        int difference = Math.abs(seconds1 - seconds2);

        System.out.println("A diferença entre os horários é: " + difference + " segundos");
    }

    private static int convertToSeconds(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        return hours * 3600 + minutes * 60 + seconds;
    }
}
