import java.util.Scanner;

public class Ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int quantidadeLinhas = sc.nextInt();

        desenharPiramide(quantidadeLinhas);

        sc.close();
    }

    public static void desenharPiramide(int numLinhas) {
        for (int i = 1; i <= numLinhas; i++) {
            for (int j = 1; j <= numLinhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

