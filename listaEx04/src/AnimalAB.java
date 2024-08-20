public abstract class AnimalAB implements AnimalIF {

    protected int comidaIngerida;
    protected int caminhoPercorrido;
    protected int horasDormidas;

    public AnimalAB() {
        this.comidaIngerida = 0;
        this.caminhoPercorrido = 0;
        this.horasDormidas = 0;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();
}
