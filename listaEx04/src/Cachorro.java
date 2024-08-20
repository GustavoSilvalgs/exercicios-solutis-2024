public class Cachorro extends AnimalAB {

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, 4, 0, 0, altura, peso);
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
        comidaIngerida += 5;
        System.out.println("O cachorro comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 15;
        System.out.println("O cachorro se moveu, percorrendo: " + caminhoPercorrido);
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
        System.out.println("O cachorro dormiu " + horasDormidas + " horas");
    }
}
