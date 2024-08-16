import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Descontos: ");
        double desconto = sc.nextDouble();

        System.out.print("Valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        double salarioLiquido = salarioBruto - desconto;
        
        if (valorEmprestimo <= salarioLiquido * 0.30) {
            System.out.println("Empréstimo aprovado!");
        }else {
            System.out.println("Empréstimo negado!");
        }
        sc.close();
    }

}
