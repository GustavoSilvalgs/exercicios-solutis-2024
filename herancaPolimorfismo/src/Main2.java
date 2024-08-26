public class Main2 {
    public static void main(String[] args) {

       /* int totalFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];

        int numBasico = (int) (totalFuncionarios * 0.40);
        int numMedio = (int) (totalFuncionarios * 0.40);
        int numSuperior = (int) (totalFuncionarios * 0.20);

        for (int i = 0; i < numBasico; i++) {
            funcionarios[i] = new FuncionarioEnsinoBasico("Funcionário Básico " + (i + 1), "B" + (i + 1), "Escola Básica " + (i + 1));
        }

        for (int i = 0; i < numMedio; i++) {
            funcionarios[numBasico + i] = new FuncionarioEnsinoMedio("Funcionário Médio " + (i + 1), "M" + (i + 1), "Escola Básica " + (i + 1), "Escola Média " + (i + 1));
        }

        for (int i = 0; i < numSuperior; i++) {
            funcionarios[numBasico + numMedio + i] = new FuncionarioGraduacao("Funcionário Superior " + (i + 1), "S" + (i + 1), "Escola Básica " + (i + 1), "Escola Média " + (i + 1), "Universidade " + (i + 1));
        }

        double custoTotal = 0.0;
        double custoBasico = 0.0;
        double custoMedio = 0.0;
        double custoSuperior = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRendaTotal();
            custoTotal += renda;

            if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += renda;
            }
            if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += renda;
            }
            if (funcionario instanceof FuncionarioGraduacao) {
                custoSuperior += renda;
            }
        }

        System.out.println("Custo Total: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Custo Ensino Básico: R$ " + String.format("%.2f", custoBasico));
        System.out.println("Custo Ensino Médio: R$ " + String.format("%.2f", custoMedio));
        System.out.println("Custo Ensino Superior: R$ " + String.format("%.2f", custoSuperior));*/

        /*Comissao gc = new Gerente(1000.00);
        Comissao sc = new Supervisor(1000.00);
        Comissao vc = new Vendedor(1000.00);

        Funcionario gerente = new Funcionario("Gustavo", "1234", gc);
        Funcionario supervisor = new Funcionario("Silva", "4321", sc);
        Funcionario vendedor = new Funcionario("Maria", "2580", vc);

        System.out.println("Gerente:");
        System.out.println(gerente);
        System.out.println();

        System.out.println("Supervisor:");
        System.out.println(supervisor);
        System.out.println();

        System.out.println("Vendedor:");
        System.out.println(vendedor);*/

        int totalFuncionarios = 10;
        Funcionario[] funcionarios = new Funcionario[totalFuncionarios];

        int numGerentes = (int) (totalFuncionarios * 0.10);
        int numSupervisores = (int) (totalFuncionarios * 0.20);
        int numVendedores = (int) (totalFuncionarios * 0.70);

        for (int i = 0; i < numGerentes; i++) {
            funcionarios[i] = new Funcionario("Gerente " + (i + 1), "G" + (i + 1), new Gerente(5000.00));
        }

        for (int i = 0; i < numSupervisores; i++) {
            funcionarios[numGerentes + i] = new Funcionario("Supervisor " + (i + 1), "S" + (i + 1), new Supervisor(3000.00));
        }

        for (int i = 0; i < numVendedores; i++) {
            funcionarios[numGerentes + numSupervisores + i] = new Funcionario("Vendedor " + (i + 1), "V" + (i + 1), new Vendedor(1500.00));
        }

        double custoTotal = 0.0;
        double custoGerentes = 0.0;
        double custoSupervisores = 0.0;
        double custoVendedores = 0.0;

        for (Funcionario funcionario : funcionarios) {
            double renda = funcionario.calcularRendaTotal();
            custoTotal += renda;

            if (funcionario.getComissao() instanceof Gerente) {
                custoGerentes += renda;
            }
            if (funcionario.getComissao() instanceof Supervisor) {
                custoSupervisores += renda;
            }
            if (funcionario.getComissao() instanceof Vendedor) {
                custoVendedores += renda;
            }

            System.out.println(funcionario.toString());
            System.out.println("------------------------------");
        }

        System.out.println("Custo Total: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Custo Gerentes: R$ " + String.format("%.2f", custoGerentes));
        System.out.println("Custo Supervisores: R$ " + String.format("%.2f", custoSupervisores));
        System.out.println("Custo Vendedores: R$ " + String.format("%.2f", custoVendedores));
    }
}

