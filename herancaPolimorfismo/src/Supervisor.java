public class Supervisor extends Comissao {

    private static final double ADICIONAL = 600.00;

    public Supervisor(double salario) {
        super(salario);
    }

    @Override
    public double calcularSalarioComissao() {
        return getSalario() + ADICIONAL;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissão de Supervisor: R$ " + String.format("%.2f", ADICIONAL) + "\nSalário Total: R$ " + String.format("%.2f", calcularSalarioComissao());
    }
}
