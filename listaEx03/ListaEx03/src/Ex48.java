import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        //Descida se um aluno será aprovado, reprovado por nota ou reprovado por faltas. Use o
        //sistema de avaliação da FAESA. Pergunte ao usuário a quantidade de notas para cálculo
        //da média semestral, sendo que todas elas possuem o mesmo peso.

        Scanner sc = new Scanner(System.in);
        int i = 0;
        double soma=0.0f;
        double media=0.0f;

        System.out.println("Quantas notas você tem?");
        int numerosDeNotas = sc.nextInt();

        double[] notas = new double[numerosDeNotas];

        while (i < numerosDeNotas) {
            System.out.println("Digite a nota de numero " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
            i++;
        }
        System.out.println("Quantas faltas você teve?");
        int numerosDeFaltas = sc.nextInt();

        media = soma / numerosDeNotas;
        if(media >= 7 && numerosDeFaltas <= 20){
            System.out.println("ALUNO APROVADO");
        } else if (media < 7.0 && numerosDeFaltas <= 15) {
            System.out.println("ALUNO REPROVADO POR NOTA");
        }else{
            System.out.println("ALUNO REPROVADO POR FALTA");
        }

    }
}
