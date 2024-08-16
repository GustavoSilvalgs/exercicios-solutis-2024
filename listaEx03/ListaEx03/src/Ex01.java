import java.util.Scanner;

public class Ex01 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu ano de nascimento: ");
    int anoNacimento = sc.nextInt();

    System.out.println("Digite o ano atual: ");

    int anoAtual = sc.nextInt();

    int idade = anoAtual - anoNacimento;

    System.out.println("A sua idade é: " + idade + " anos");
    sc.close();

    
 }
}
