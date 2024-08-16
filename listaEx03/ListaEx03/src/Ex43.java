import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        //43. Calcule a média aritmética de 500 valores fornecidos pelo usuário.
        double soma = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 500 números: ");
        for (int i = 0; i < 500; i++) {
            double valores = sc.nextDouble();
            soma += valores;
        }
        media = soma / 500;
        System.out.println("Media: " + media);
        sc.close();
    }
}