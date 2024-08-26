public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void adicionarAnimal(Animal animal, int jaula) {
        if (jaula >= 0 && jaula < jaulas.length) {
            jaulas[jaula] = animal;
        } else {
            System.out.println("Número da jaula inválido");
        }
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                if (animal instanceof Cachorro || animal instanceof Cavalo) {
                    animal.correr();
                }
                System.out.println("==========");
            }
        }
    }
}

