public class Gato extends AnimalAB {

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
