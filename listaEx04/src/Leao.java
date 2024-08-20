public class Leao extends AnimalAB {

    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, 4, 0, 0, altura, peso);
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
        comidaIngerida += 25;
        System.out.println("O Leão comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 30;
        System.out.println("O Leão se moveu, percorrendo: " + caminhoPercorrido);
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O Leão dormiu " + horasDormidas + " horas");
    }
}
