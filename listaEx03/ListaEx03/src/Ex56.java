import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidatos = new String[3];
        for (int i = 0; i < candidatos.length; i++) {
            System.out.print("Digite o nome do candidato " + (i + 1) + ": ");
            candidatos[i] = scanner.nextLine();
        }

        int[] votos = new int[3];
        int votosEmBranco = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Voto " + (i + 1) + ":");
            System.out.println("Digite o número do candidato (1 a 3) ou 0 para voto em branco:");
            int voto = scanner.nextInt();

            if (voto >= 1 && voto <= 3) {
                votos[voto - 1]++;
            } else if (voto == 0) {
                votosEmBranco++;
            } else {
                System.out.println("Voto inválido. Ignorando voto.");
            }
        }

        int totalVotos = 5;
        int maxVotos = 0;
        int indiceGanhador = -1;
        boolean empate = false;

        for (int i = 0; i < votos.length; i++) {
            double percentual = (double) votos[i] / totalVotos * 100;
            System.out.println(candidatos[i] + ": " + votos[i] + " votos (" + percentual + "%)");

            if (votos[i] > maxVotos) {
                maxVotos = votos[i];
                indiceGanhador = i;
                empate = false;
            } else if (votos[i] == maxVotos) {
                empate = true;
            }
        }

        double percentualVotosEmBranco = (double) votosEmBranco / totalVotos * 100;
        System.out.println("Votos em branco: " + votosEmBranco + " votos (" + percentualVotosEmBranco + "%)");

        if (empate) {
            System.out.println("Houve um empate. Será necessário um segundo turno.");
        } else if (indiceGanhador != -1) {
            System.out.println("O ganhador da eleição é: " + candidatos[indiceGanhador]);
        } else {
            System.out.println("Nenhum candidato recebeu votos suficientes para ganhar a eleição.");
        }

        scanner.close();
    }
}
