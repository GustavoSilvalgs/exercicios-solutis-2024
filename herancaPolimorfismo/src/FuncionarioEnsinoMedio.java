public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private String escolaEnsinoMedio;

    public FuncionarioEnsinoMedio(String nome, String codigoFuncional, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigoFuncional, escolaEnsinoBasico);
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
