import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        //46. Determine a quantidade de homens e mulheres (separadamente)
        // que são maiores de
        //idade, baseado numa lista de 200 pessoas.

        Scanner sc = new Scanner(System.in);

        int quantidadePessoas = 200;
        int quantidadeHomensMaioresIdade = 0;
        int quantidadeMulheresMaioresIdade = 0;

        for (int i = 1; i <= quantidadePessoas; i++) {
            System.out.print("Digite o sexo (M/F) da pessoa " + i + ": ");
            char sexo = sc.next().charAt(0);

            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                if (sexo == 'M' || sexo == 'm') {
                    quantidadeHomensMaioresIdade++;
                } else if (sexo == 'F' || sexo == 'f') {
                    quantidadeMulheresMaioresIdade++;
                }
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + quantidadeHomensMaioresIdade);
        System.out.println("Quantidade de mulheres maiores de idade: " + quantidadeMulheresMaioresIdade);

        sc.close();
    }
}