import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        //44. Modifique o problema anterior para que a quantidade de valores também seja fornecida pelo
        //usuário.
        double soma = 0;
        double media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores deseja informar: ");
        int valoresDigitados = sc.nextInt();
        for (int i = 0; i < valoresDigitados; i++) {
            System.out.println("Digite o valor do " + (i+1) + ": ");
            double valores = sc.nextDouble();
            soma += valores;
        }

        media = soma / valoresDigitados;
        System.out.println("Media: " + media);
        sc.close();
    }
}

