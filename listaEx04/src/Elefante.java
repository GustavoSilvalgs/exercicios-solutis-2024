public class Elefante extends AnimalTerrestreAB {

    public Elefante(String nome, int idade, String habitat, int quantidadePatas, double altura, double peso) {
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
        comidaIngerida += 20;
        System.out.println("O elefante comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 20;
        System.out.println("O elefante se moveu, percorrendo: " + caminhoPercorrido);
    }

    @Override
    public void dormir() {
        horasDormidas += 5;
        System.out.println("O elefante dormiu " + horasDormidas + " horas");
    }
}
