public class TesteAnimais {
    public static void main(String[] args) {

        // Instanciando animais com parâmetros necessários
        Cachorro cachorro = new Cachorro("Pity", 5, "Quintal", 0.30, 15.0);
        Gato gato = new Gato("Milly", 9, "Quarto", 0.30, 5.3);
        Elefante elefante = new Elefante("Orelhudo", 15, "Savana", 3.00, 400.0);
        Leao leao = new Leao("Leo", 8, "Savana", 1.37, 190.0);
        Peixe peixe = new Peixe("Tilapia", 1, "Lago", 0.10, 0.5);
        Pombo pombo = new Pombo("Jubileu", 2, "Floresta", 0.25, 1.0, 1.0);

        // Testando Cachorro
        System.out.println("Cachorro:");
        exibirDados(cachorro);
        System.out.println();

        // Testando Gato
        System.out.println("Gato:");
        exibirDados(gato);
        System.out.println();

        // Testando Elefante
        System.out.println("Elefante:");
        exibirDados(elefante);
        System.out.println();

        // Testando Leão
        System.out.println("Leão:");
        exibirDados(leao);
        System.out.println();

        // Testando Peixe
        System.out.println("Peixe:");
        exibirDados(peixe);
        System.out.println();

        // Testando Pombo
        System.out.println("Pombo:");
        exibirDados(pombo);
    }

    public static void exibirDados(AnimalAB animal) {
        if (animal instanceof Cachorro cachorro) {
            System.out.println("Nome: " + cachorro.getNome());
            System.out.println("Idade: " + cachorro.getIdade());
            System.out.println("Habitat: " + cachorro.getHabitat());
            System.out.println("Altura: " + cachorro.getAltura());
            System.out.println("Peso: " + cachorro.getPeso());
            cachorro.comer();
            cachorro.moverse();
            cachorro.dormir();
        } else if (animal instanceof Gato gato) {
            System.out.println("Nome: " + gato.getNome());
            System.out.println("Idade: " + gato.getIdade());
            System.out.println("Habitat: " + gato.getHabitat());
            System.out.println("Altura: " + gato.getAltura());
            System.out.println("Peso: " + gato.getPeso());
            gato.comer();
            gato.moverse();
            gato.dormir();
        } else if (animal instanceof Elefante elefante) {
            System.out.println("Nome: " + elefante.getNome());
            System.out.println("Idade: " + elefante.getIdade());
            System.out.println("Habitat: " + elefante.getHabitat());
            System.out.println("Altura: " + elefante.getAltura());
            System.out.println("Peso: " + elefante.getPeso());
            elefante.comer();
            elefante.moverse();
            elefante.dormir();
        } else if (animal instanceof Leao leao) {
            System.out.println("Nome: " + leao.getNome());
            System.out.println("Idade: " + leao.getIdade());
            System.out.println("Habitat: " + leao.getHabitat());
            System.out.println("Altura: " + leao.getAltura());
            System.out.println("Peso: " + leao.getPeso());
            leao.comer();
            leao.moverse();
            leao.dormir();
        } else if (animal instanceof Peixe peixe) {
            System.out.println("Nome: " + peixe.getNome());
            System.out.println("Idade: " + peixe.getIdade());
            System.out.println("Habitat: " + peixe.getHabitat());
            System.out.println("Altura: " + peixe.getAltura());
            System.out.println("Peso: " + peixe.getPeso());
            peixe.comer();
            peixe.nadar();
            peixe.dormir();
        } else if (animal instanceof Pombo pombo) {
            System.out.println("Nome: " + pombo.getNome());
            System.out.println("Idade: " + pombo.getIdade());
            System.out.println("Habitat: " + pombo.getHabitat());
            System.out.println("Altura: " + pombo.getAltura());
            System.out.println("Peso: " + pombo.getPeso());
            pombo.comer();
            pombo.voar();
            pombo.dormir();
        }
    }
}
