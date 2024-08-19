import java.util.Scanner;

public class Ex47 {
    //47. Leia uma relação de pacientes de uma clínica, cada um com o nome, o sexo, o peso, a
    //idade e a altura. Para sinalizar o fim da lista será fornecido “fim” no nome do último
    //paciente.
    //Exiba um relatório contendo:
    //i. a quantidade de pacientes.
    //ii. a média de idade dos homens.
    //iii. a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg.
    //iv. a quantidade de pessoas com idade entre 18 e 25.
    //v. o nome do paciente mais velho.
    //vi. o nome da mulher mais baixa.
    //vii. – neste item, você cria uma situação interessante constrói o algoritmo correspondente.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtePacientes = 0;
        int qteHomens = 0;
        int qteMulheresAlturaPeso = 0;
        int qtePessoasIdade18a25 = 0;
        int idadeMaisVelho = 0;
        int somaIdadeHomens = 0;
        int alturaMulherMaisBaixa = 999;
        int alturaHomemMaisBaixa = 999;
        double mediaIdadeHomens;
        String nomePacienteMaisVelho = "", nomeMulherMaisBaixa = "", nomeHomemMaisBaixo = "";

        while (true) {
            System.out.println("Digite o nome do paciente " + (qtePacientes + 1) +
                    " (ou digite fim para encerrar)");
            String nome = sc.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite o gênero do paciente (M para masculino e F para feminino)");
            String genero = sc.nextLine();

            System.out.println("Digite o peso do paciente em kg");
            double peso = sc.nextDouble();

            System.out.println("Digite a idade do paciente");
            int idade = sc.nextInt();

            System.out.println("Digite a altura do paciente em cm");
            int altura = sc.nextInt();
            sc.nextLine();

            System.out.println();
            qtePacientes++;

            if (genero.equalsIgnoreCase("M")) {
                qteHomens++;
                somaIdadeHomens += idade;
                if (altura < alturaHomemMaisBaixa) {
                    alturaHomemMaisBaixa = altura;
                    nomeHomemMaisBaixo = nome;
                }

            } else if (genero.equalsIgnoreCase("F") && altura < alturaMulherMaisBaixa) {
                alturaMulherMaisBaixa = altura;
                nomeMulherMaisBaixa = nome;
            }

            if (genero.equalsIgnoreCase("F") && altura >= 160 && altura <= 170 && peso > 70) {
                qteMulheresAlturaPeso++;
            }

            if (idade >= 18 && idade <= 25) {
                qtePessoasIdade18a25++;
            }

            if (idade > idadeMaisVelho) {
                idadeMaisVelho = idade;
                nomePacienteMaisVelho = nome;
            }
        }

        mediaIdadeHomens = (double) somaIdadeHomens / qteHomens;

        System.out.println("\nA quantidade de pacientes é de: " + qtePacientes);
        System.out.println("A média da idade dos homens é de: " + mediaIdadeHomens);
        System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg é de: " + qteMulheresAlturaPeso);
        System.out.println("A quantidade de pessoas com idade entre 18 a 25 é de: " + qtePessoasIdade18a25);
        System.out.println("O nome do paciente mais velho é: " + nomePacienteMaisVelho);
        System.out.println("O nome da mulher mais baixa é: " + nomeMulherMaisBaixa);
        System.out.println("O nome do homem mais baixo é: " + nomeHomemMaisBaixo);
    }
}