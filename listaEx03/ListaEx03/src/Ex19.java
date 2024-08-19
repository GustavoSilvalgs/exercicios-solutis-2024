import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = sc.nextInt();

        if(num1 < num2) {
            System.out.println("Em ordem crescente os números informados são: " + num1 + " e " + num2);
        } else if(num1 > num2) {
            System.out.println("Em ordem crescente os números informados são: " + num2 + " e " + num1);
        } else {
            System.out.println("Os números informados são iguais: " + num1 + " e " + num2);
        }

        sc.close();
    }
}