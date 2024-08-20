public class Leao extends AnimalAB {

    @Override
    public void comer() {
        comidaIngerida += 25;
        System.out.println("O Leao comeu, ingerindo: " + comidaIngerida);
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 30;
        System.out.println("O Leao se moveu, percorrendo: " + caminhoPercorrido);
    }

    @Override
    public void dormir() {
        horasDormidas += 10;
        System.out.println("O Leao dormiu " + horasDormidas + " horas");
    }
}
