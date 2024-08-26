public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double rendaBase = 1000.00;

    public Funcionario(String nome, String codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
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

    public double calcularRendaTotal() {
        return rendaBase;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCódigo Funcional: " + codigoFuncional + "\nRenda Total: R$ " + String.format("%.2f", calcularRendaTotal());
    }
}
