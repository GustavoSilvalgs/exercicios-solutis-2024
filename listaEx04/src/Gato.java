public class Gato extends AnimalTerrestreAB {

    public Gato(String nome, int idade, String habitat, int quantidadePatas, double altura, double peso) {
        super(nome, idade, habitat, quantidadePatas, altura, peso);
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
        comidaIngerida += 8;
        System.out.println("O gato comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 9;
        System.out.println("O gato se moveu, percorrendo: " + caminhoPercorrido);
    }

    @Override
    public void dormir() {
        horasDormidas += 18;
        System.out.println("O gato dormiu " + horasDormidas + " horas");
    }
}
