public abstract class AnimalMarinhoAB extends AnimalAB {

    public AnimalMarinhoAB(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Marinho", idade, habitat, 0, 0, 0, altura, peso);
    }

    public abstract void nadar();
}
