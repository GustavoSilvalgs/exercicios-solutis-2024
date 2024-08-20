public class Elefante extends AnimalAB {

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
