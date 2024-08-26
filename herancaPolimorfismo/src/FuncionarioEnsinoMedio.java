public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, Comissao comissao, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, comissao, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public String getEscolaEnsinoMedio() {
        return escolaEnsinoMedio;
    }

    public void setEscolaEnsinoMedio(String escolaEnsinoMedio) {
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    @Override
    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEscola do Ensino Médio: " + escolaEnsinoMedio;
    }
}
