public class Main {
    public static void main(String[] args) {
        /*Animal animal;

        animal = new Cachorro("Toto", 5);
        animal.emitirSom();

        animal = new Cavalo("Alazao", 8);
        animal.emitirSom();

        animal = new Preguica("Dorminhoco", 3);
        animal.emitirSom();*/

        /*Veterinario veterinario = new Veterinario();

        Animal cachorro = new Cachorro("Toto", 5);
        Animal cavalo = new Cavalo("Alazao", 8);
        Animal preguica = new Preguica("Dorminhoco", 3);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);*/

        Zoologico zoologico = new Zoologico();

        zoologico.adicionarAnimal(new Cachorro("Cachorro1", 1), 0);
        zoologico.adicionarAnimal(new Cavalo("Cavalo1", 2), 1);
        zoologico.adicionarAnimal(new Preguica("Preguica1", 3), 2);
        zoologico.adicionarAnimal(new Cachorro("Cachorro2", 4), 3);
        zoologico.adicionarAnimal(new Cavalo("Cavalo2", 5), 4);
        zoologico.adicionarAnimal(new Preguica("Preguica2", 6), 5);
        zoologico.adicionarAnimal(new Cachorro("Cachorro3", 7), 6);
        zoologico.adicionarAnimal(new Cavalo("Cavalo3", 8), 7);
        zoologico.adicionarAnimal(new Preguica("Preguica3", 9), 8);
        zoologico.adicionarAnimal(new Cachorro("Cachorro4", 10), 9);

        zoologico.percorrerJaulas();
    }
}
