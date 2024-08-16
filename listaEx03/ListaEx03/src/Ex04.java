import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite terceira nota: ");
        double nota3 = sc.nextDouble();
        System.out.print("Digite quarta nota: ");
        double nota4 = sc.nextDouble();


        double media = (nota1 + nota2 + nota3 + nota4) /4;

        System.out.printf("A sua média é :" + media);

        sc.close();
    }
}
