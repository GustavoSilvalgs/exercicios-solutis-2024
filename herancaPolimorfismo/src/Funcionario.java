public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double rendaBase = 1000.00;
    private Comissao comissao;

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public double getRendaBase() {
        return rendaBase;
    }

    public void setRendaBase(double rendaBase) {
        this.rendaBase = rendaBase;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        double rendaTotal = rendaBase;
        if (comissao != null) {
            rendaTotal += comissao.calcularSalarioComissao() - comissao.getSalario();
        }
        return rendaTotal;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                (comissao != null ? "\nComissão: R$ " + String.format("%.2f", comissao.calcularSalarioComissao() - comissao.getSalario()) : "\nComissão: R$ 0.00") +
                "\nSalário Total: R$ " + String.format("%.2f", calcularRendaTotal());
    }
}
