public class TesteAnimais {
    public static void main(String[] args) {

        AnimalAB cachorro = new Cachorro();
        AnimalAB gato = new Gato();
        AnimalAB elefante = new Elefante();
        AnimalAB leao = new Leao();
        AnimalMarinhoAB peixe = new Peixe();
        AnimalVoadorAB pombo = new Pombo();

        System.out.println("Cachorro:");
        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();
        System.out.println();

        System.out.println("Gato:");
        gato.comer();
        gato.moverse();
        gato.dormir();
        System.out.println();

        System.out.println("Elefante:");
        elefante.comer();
        elefante.moverse();
        elefante.dormir();
        System.out.println();

        System.out.println("Leão:");
        leao.comer();
        leao.moverse();
        leao.dormir();
        System.out.println();

        System.out.println("Peixe:");
        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        System.out.println();

        System.out.println("Pombo:");
        pombo.comer();
        pombo.moverse();
        pombo.dormir();
    }
}

