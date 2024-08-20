import java.util.Scanner;

public class Ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informar a quantidade de triângulos: ");
        int qtdTriangulos = sc.nextInt();

        for (int i = 1; i <= qtdTriangulos; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

