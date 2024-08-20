public abstract class AnimalAB implements AnimalIF {

    protected String nome;
    protected String tipo;
    protected int idade;
    protected String habitat;
    protected int quantidadePatas;
    protected int quantidadeAsas;
    protected double envergaduraAsas;
    protected double altura;
    protected double peso;
    protected int comidaIngerida;
    protected int caminhoPercorrido;
    protected int horasDormidas;

    public AnimalAB(String nome, String tipo, int idade, String habitat, int quantidadePatas, int quantidadeAsas, double envergaduraAsas, double altura, double peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadePatas = quantidadePatas;
        this.quantidadeAsas = quantidadeAsas;
        this.envergaduraAsas = envergaduraAsas;
        this.altura = altura;
        this.peso = peso;
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
