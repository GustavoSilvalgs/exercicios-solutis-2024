public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, String habitat, double altura, double peso, double envergaduraAsas) {
        super(nome, idade, habitat, altura, peso, envergaduraAsas);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public void comer() {
        comidaIngerida += 10;
        System.out.println("O pombo comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        voar();
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O pombo dormiu " + horasDormidas + " horas");
    }

    @Override
    public void voar() {
        caminhoPercorrido += 50;
        System.out.println("O pombo voou, percorrendo: " + caminhoPercorrido);
    }
}
