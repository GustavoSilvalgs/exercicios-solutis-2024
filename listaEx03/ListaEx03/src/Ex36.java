import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        //36. Exiba todos os números ímpares existentes entre dois números informados pelo usuário.
        Scanner sc = new Scanner(System.in);

        System.out.println("todos os números ímpares existentes entre dois números");
        System.out.print("Primeiro número: ");
        int start = sc.nextInt();

        System.out.print("Segundo número: ");
        int stop = sc.nextInt();

        for (int i = start; i <= stop; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
