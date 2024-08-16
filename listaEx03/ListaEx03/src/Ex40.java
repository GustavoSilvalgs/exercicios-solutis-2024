import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        //40. Solicite ao usuário a idade de cada um componente de um grupo de pessoas. A quantidade
        //de pessoas também será determinada por ele.
        //Após o término da entrada, apresente:
        //a. a média das idades,
        //b. a maior idade,
        //c. a menor idade,
        //d. a quantidade de pessoas maior de idade.
        int contador = 0;
        int idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de pessoas: ");
        int quantidadeDePessoas = sc.nextInt();
        int maiorIdade = 0;
        int menorIdade = 0;
        int maioresDeIdade = 0;
        int somaIdade = 0;
        while (contador < quantidadeDePessoas ) {
            System.out.println("Idade: ");
            idade = sc.nextInt();
            if (contador == 0){
                maiorIdade = idade;
                menorIdade = idade;
            }
            if (idade >= 18){
                maioresDeIdade += 1;
            }
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            if ( idade < menorIdade){
                menorIdade = idade;
            }
            somaIdade +=idade;
            contador+=1;
        }
        double mediaIdade = (double) somaIdade / quantidadeDePessoas;
        System.out.println("Pessoas Cadastradas: " + quantidadeDePessoas);
        System.out.println("Maior Idade: " + maiorIdade);
        System.out.println("Menor Idade: " + menorIdade);
        System.out.println("Média das idades: " + mediaIdade);
        System.out.println(maioresDeIdade+ " maiores de idade");


    }
}
