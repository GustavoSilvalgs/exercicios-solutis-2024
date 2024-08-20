public class Pombo extends AnimalVoadorAB {

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
