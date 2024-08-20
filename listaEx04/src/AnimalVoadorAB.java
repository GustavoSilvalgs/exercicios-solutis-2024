public abstract class AnimalVoadorAB extends AnimalAB {

    public AnimalVoadorAB(String nome, int idade, String habitat, double altura, double peso, double envergaduraAsas) {
        super(nome, "Voador", idade, habitat, 2, 2, envergaduraAsas, altura, peso);
    }

    public abstract void voar();
}
