import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do consumo do cliente: R$ ");
        double valorConsumo = sc.nextDouble();

        System.out.printf("A comissão do garcom será: R$ %.2f%n", valorConsumo * 0.10);

        sc.close();
    }
    
    
}
