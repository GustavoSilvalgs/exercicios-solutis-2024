import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double grade1 = sc.nextDouble();

        System.out.print("Enter the second grade: ");
        double grade2 = sc.nextDouble();

        System.out.print("Enter the third grade: ");
        double grade3 = sc.nextDouble();

        double average = (grade1 + grade2 + grade3) / 3.0;

        System.out.printf("Average = %.1f\n", average);

        if (average >= 7.0) {
            System.out.println("Passed!");
        } else if (average >= 5.0) {
            System.out.println("The student needs to take a makeup exam!");
        } else {
            System.out.println("Failed!");
        }
        sc.close();
    }
}
