public class Vendedor extends Comissao {

    private static final double ADICIONAL = 250.00;

    public Vendedor(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalarioComissao() {
        return getSalario() + ADICIONAL;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão de Vendedor: R$ " + String.format("%.2f", ADICIONAL) + "\nSalário Total: R$ " + String.format("%.2f", calcularSalarioComissao());
    }
}
