public class TesteAnimais {
    public static void main(String[] args) {

        AnimalAB cachorro = new Cachorro();
        AnimalAB gato = new Gato();
        AnimalAB elefante = new Elefante();
        AnimalAB leao = new Leao();

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
    }
}

