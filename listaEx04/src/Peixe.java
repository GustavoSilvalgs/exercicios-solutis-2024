public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, idade, habitat, altura, peso);
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
        comidaIngerida += 6;
        System.out.println("O peixe comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        nadar();
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
        System.out.println("O peixe dormiu " + horasDormidas + " horas");
    }

    @Override
    public void nadar() {
        caminhoPercorrido += 20;
        System.out.println("O peixe nadou, percorrendo: " + caminhoPercorrido);
    }
}
