import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();

        try {
            System.out.print("Enter the date (dd/MM/yyyy): ");
            String dateStr = sc.next();
            Date date = sdf.parse(dateStr);
            calendar.setTime(date);

            System.out.print("Enter the number of days to sum: ");
            int quantityDays = sc.nextInt();

            calendar.add(Calendar.DAY_OF_MONTH, quantityDays);

            String dateSum = sdf.format(calendar.getTime());
            System.out.println(dateStr + " + " + quantityDays + " = " + dateSum);
        } catch (ParseException e) {
            System.out.println("Invalid date format! Use (dd/MM/yyy)");
        }

        sc.close();
    }
}
