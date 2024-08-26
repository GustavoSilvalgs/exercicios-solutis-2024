public class FuncionarioEnsinoBasico extends Funcionario {
    private String escolaEnsinoBasico;

    public FuncionarioEnsinoBasico(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico) {
        super(nome, codigoFuncional, comissao);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    public String getEscolaEnsinoBasico() {
        return escolaEnsinoBasico;
    }

    public void setEscolaEnsinoBasico(String escolaEnsinoBasico) {
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBase() * 1.10;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola do Ensino Básico: " + escolaEnsinoBasico;
    }
}
