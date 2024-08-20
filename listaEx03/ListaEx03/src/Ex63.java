import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int numberOfRows = sc.nextInt();

        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }

        sc.close();
    }
}

