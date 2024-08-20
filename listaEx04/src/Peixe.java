public class Peixe extends AnimalMarinhoAB {

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
