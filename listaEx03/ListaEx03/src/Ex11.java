import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar");
        }else if (idade >= 16 && idade <18 || idade >= 65) {
            System.out.println("Voto facultativo");
            
        }else {
            System.out.println("O voto é obrigatório");
        }
        sc.close();
    }

}
