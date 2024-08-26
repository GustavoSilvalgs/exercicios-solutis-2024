public class Gerente extends Comissao {

    private static final double ADICIONAL = 1500.00;

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalarioComissao() {
        return getSalario() + ADICIONAL;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão de Gerente: R$ " + String.format("%.2f", ADICIONAL) + "\nSalário Total: R$ " + String.format("%.2f", calcularSalarioComissao());
    }
}
