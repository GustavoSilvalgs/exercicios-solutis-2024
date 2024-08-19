import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cargo do funcionário (Diretoria/Gerência/Operacional): ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        double percentual = 0.0;

        if (cargo.equalsIgnoreCase("diretoria")) {
            percentual = 0.3;
        } else if (cargo.equalsIgnoreCase("gerência")) {
            percentual = 0.25;
        } else if (cargo.equalsIgnoreCase("operacional")) {
            percentual = 0.2;
        } else {
            System.out.println("Cargo inválido.");
        }

        double valorEmprestimo = salario * percentual;

        System.out.println("Valor do empréstimo possível: R$" + valorEmprestimo);

        scanner.close();
    }
}