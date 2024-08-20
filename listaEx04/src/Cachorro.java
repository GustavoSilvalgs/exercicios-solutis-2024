public class Cachorro extends AnimalAB {

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
