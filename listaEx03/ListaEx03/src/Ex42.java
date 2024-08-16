import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//42. Aproveitando o algoritmo do exercício anterior, exiba uma lista de 40 grupos de números
//sorteados de 0 a 59. Cada grupo possui 3 números e deve exibido em ordem crescente.
public class Ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        int tentativas = 0;
        int respostaCorreta = rand.nextInt(1, 101);
        int guess;
        do {
            System.out.println("Qual é o número: ");
            guess = sc.nextInt();
            if (guess > respostaCorreta) {
                System.out.println("Tente um valor Menor");
            } else if (guess < respostaCorreta) {
                System.out.println("Tente um valor Maior");
            }
            tentativas++;
        } while (guess != respostaCorreta);

        System.out.println("Você acertou! A resposta era " + respostaCorreta);
        System.out.println("Foram feitas " + tentativas + " tentativas");


        System.out.println("Lista de 40 grupos de números sorteados:");

        for (int i = 0; i < 40; i++) {
            int[] grupo = new int[3];
            for (int j = 0; j < 3; j++) {
                grupo[j] = rand.nextInt(60);
            }
            Arrays.sort(grupo);
            System.out.println("Grupo " + (i + 1) + ": " + Arrays.toString(grupo));
        }

        sc.close();
    }
}
