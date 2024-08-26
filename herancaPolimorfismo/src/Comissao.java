public abstract class Comissao {
    private double salario;

    public Comissao(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double calcularSalarioComissao();

    @Override
    public String toString() {
        return "Salário Base: R$ " + String.format("%.2f", salario);
    }
}
