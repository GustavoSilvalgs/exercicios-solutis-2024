import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nomeDaPrimeiraPessoa = scanner.next();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idadeDaPrimeiraPessoa = Integer.parseInt(scanner.next());

        System.out.print("Digite o nome da segunda pessoa: ");
        String nomeDaSegundaPessoa = scanner.next();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idadeDaSegundaPessoa = Integer.parseInt(scanner.next());

        if(idadeDaPrimeiraPessoa>idadeDaSegundaPessoa){
            System.out.println(nomeDaPrimeiraPessoa);
            System.out.println(nomeDaSegundaPessoa);
        } else if (idadeDaPrimeiraPessoa<idadeDaSegundaPessoa) {
            System.out.println(nomeDaSegundaPessoa);
            System.out.println(nomeDaPrimeiraPessoa);
        }else {
            System.out.printf("%s e %s tem a mesma idade.", nomeDaPrimeiraPessoa, nomeDaSegundaPessoa);
        }
    }
}