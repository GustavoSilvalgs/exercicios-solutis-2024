public class Main {
    public static void main(String[] args) {
        Animal animal;

        animal = new Cachorro("Toto", 5);
        animal.emitirSom();

        animal = new Cavalo("Alazao", 8);
        animal.emitirSom();

        animal = new Preguica("Dorminhoco", 3);
        animal.emitirSom();
    }
}
