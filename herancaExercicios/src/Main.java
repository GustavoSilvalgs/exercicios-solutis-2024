import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        testarFornecedor(sc);
//        testarEmpregado(sc);
//        testarAdministrador(sc);
        testarOperario(sc);
    }

    private static Pessoa coletarDadosPessoa(Scanner sc) {
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu endereço: ");
        String endereco = sc.nextLine();
        System.out.print("Digite seu telefone: ");
        String telefone = sc.nextLine();
        return new Pessoa(nome, endereco, telefone);
    }

    private static void testarFornecedor(Scanner sc) {
        System.out.println("Teste fornecedor");
        Pessoa pessoa = coletarDadosPessoa(sc);
        System.out.print("Digite o valor do crédito: ");
        double credito = sc.nextDouble();
        System.out.print("Digite o valor da dívida: ");
        double divida = sc.nextDouble();
        sc.nextLine();

        Fornecedor fornecedor = new Fornecedor(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone(), credito, divida);
        System.out.println("Saldo: " + fornecedor.obterSaldo());

        System.out.println();
    }

    private static void testarEmpregado(Scanner sc) {
        System.out.println("Teste Empregado");
        Pessoa pessoa = coletarDadosPessoa(sc);
        System.out.print("Digite o código do setor: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.print("Digite a porcentagem de imposto: ");
        double imposto = sc.nextDouble() / 100.0;

        Empregado empregado = new Empregado(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone(), codigo, salarioBase, imposto);
        System.out.println("Salário: " + empregado.calcularSalario());

        System.out.println();
    }

    private static void testarAdministrador(Scanner sc) {
        System.out.println("Teste Administrador");
        Pessoa pessoa = coletarDadosPessoa(sc);
        System.out.print("Digite o código do setor: ");
        int codigoSetor = sc.nextInt();
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.print("Digite a porcentagem de imposto: ");
        double imposto = sc.nextDouble() / 100.0;
        System.out.print("Digite o valor da ajuda de custo: ");
        double ajudaDeCusto = sc.nextDouble();
        sc.nextLine();

        Administrador administrador = new Administrador(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone(), codigoSetor, salarioBase, imposto, ajudaDeCusto);
        System.out.println("Salário com Ajuda de Custo: " + administrador.calcularSalario());

        System.out.println();
    }

    private static void testarOperario(Scanner sc) {
        System.out.println("Teste Operário");
        Pessoa pessoa = coletarDadosPessoa(sc);
        System.out.print("Digite o código do setor: ");
        int codigoSetor = sc.nextInt();
        System.out.print("Digite o salário base: ");
        double salarioBase = sc.nextDouble();
        System.out.print("Digite a porcentagem de imposto: ");
        double imposto = sc.nextDouble() / 100.0;
        System.out.print("Digite o valor da produção: ");
        double valorProducao = sc.nextDouble();
        System.out.print("Digite a porcentagem de comissão: ");
        double comissao = sc.nextDouble() / 100.0;
        sc.nextLine();

        Operario operario = new Operario(pessoa.getNome(), pessoa.getEndereco(), pessoa.getTelefone(), codigoSetor, salarioBase, imposto, valorProducao, comissao);
        System.out.println("Salário com Comissão: " + operario.calcularSalario());

        System.out.println();
    }
}
