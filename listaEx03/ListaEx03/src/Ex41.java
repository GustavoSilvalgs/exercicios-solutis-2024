import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        //41. Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada tentativa
        //dele, forneça uma dica falando se o número é maior ou menor. Quando ele descobrir exiba
        //uma mensagem de parabéns e mostre em quantas tentativas ele conseguiu.

        int tentativas = 0;
        Scanner sc = new Scanner(System.in);
        Random rand  = new Random();
        int respostaCorreta = rand.nextInt(1, 101);
        int guess;
        do {
            System.out.println("Qual é o número: ");
            guess = sc.nextInt();
            if (guess > respostaCorreta) {
                System.out.println("Tente um valor Menor");
            }else if (guess < respostaCorreta) {
                System.out.println("Tente um valor Maior");
            }
            tentativas++;

        }while (guess != respostaCorreta);
        sc.close();
        System.out.println("Você acertou! a resposta era "+respostaCorreta);
        System.out.println("Foram feitas "+tentativas+" tentativas");
    }
}
