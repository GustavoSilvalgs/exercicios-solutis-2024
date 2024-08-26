public class Main {
    public static void main(String[] args) {
        /*Animal animal;

        animal = new Cachorro("Toto", 5);
        animal.emitirSom();

        animal = new Cavalo("Alazao", 8);
        animal.emitirSom();

        animal = new Preguica("Dorminhoco", 3);
        animal.emitirSom();*/

        Veterinario veterinario = new Veterinario();

        Animal cachorro = new Cachorro("Toto", 5);
        Animal cavalo = new Cavalo("Alazao", 8);
        Animal preguica = new Preguica("Dorminhoco", 3);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
