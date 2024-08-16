import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = sc.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = sc.nextInt();

        if (denominador == 0) { 
            System.out.println(" O numero n pode ser 0 ");
            
        }else {
            double resultado = (double) numerador / denominador;
            System.out.println("O número real é :" + resultado);
        }
        sc.close();

    }

}
