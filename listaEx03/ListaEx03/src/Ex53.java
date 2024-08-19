import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        //53. Exiba a tabuada de um número fornecido pelo usuário. Por exemplo se ele digitar o número 5, então
        //será mostrado:
        //5 x 1 = 5
        //5 x 2 = 10
        //5 x 3 = 15
        //5 x 4 = 20
        //5 x 5 = 25
        //5 x 6 = 30
        //5 x 7 = 35
        //5 x 8 = 40
        //5 x 9 = 45
        //5 x 10 = 50

        Scanner input = new Scanner(System.in);
        int i = 1;
        System.out.print("DIGITE O NUMERO NO QUAL VOCE QUER SABER A TABUADA ATÉ O 10: ");
        int numero = input.nextInt();

        while (i <= 10) {
            System.out.printf("%d x %d = %d \n", numero, i, (numero * i));
            i++;
        }
    }
}
