import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = sc.nextLine();
        System.out.print("Digite o valor do crédito: ");
        double credito = sc.nextDouble();
        System.out.print("Digite o valor da dívida: ");
        double divida = sc.nextDouble();

        Fornecedor fornecedor = new Fornecedor(nome, endereco, telefone, credito, divida);
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println();
    }
}
