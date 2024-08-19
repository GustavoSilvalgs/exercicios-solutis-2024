import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {

        //55. A operadora de celular Vai-Vai possui um plano com o valor mensal de 50,00 que permite
        //100 minutos por mês para qualquer número. Além disso, ela oferece 50 minutos a mais
        //para ligações destinadas a um número da própria Vai-Vai. Ainda neste plano ela tem uma
        //promoção onde cada minuto gasto para telefone fixo consome somente a metade. O valor
        //do minuto excedente para outras operadoras é de 0.65, e para a própria Vai-Vai é 0.20.
        //Faça um programa que permita ao usuário entrar com o tipo de ligação (‘o’ = outras
        //operadoras, ‘v’ = a própria Vai-Vai, ou ‘f’ = telefone fixo) e a quantidade de minutos. A cada
        //entrada, deve-se informar o quanto que ele tem de saldo e o valor a pagar. Faça isto
        //enquanto ele indicar que existem mais ligações a serem digitadas.

        Scanner sc = new Scanner(System.in);

        double saldo = 100.0;
        double valorPorMinutoOutrasOperadoras = 0.65;
        double valorPorMinutoVaiVai = 0.20;
        double valorPorMinutoTelefoneFixo = 0.325;

        System.out.println("Bem-vindo à operadora Vai-Vai!");

        char continuar = 's';
        while (continuar == 's') {
            System.out.print("Digite o tipo de ligação ('o' para outras operadoras, 'v' para Vai-Vai, 'f' para telefone fixo): ");
            char tipoLigacao = sc.next().charAt(0);

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = sc.nextInt();

            double valorAPagar;
            if (tipoLigacao == 'o') {
                valorAPagar = minutos * valorPorMinutoOutrasOperadoras;
            } else if (tipoLigacao == 'v') {
                valorAPagar = minutos * valorPorMinutoVaiVai;
            } else if (tipoLigacao == 'f') {
                valorAPagar = minutos * valorPorMinutoTelefoneFixo;
            } else {
                System.out.println("Tipo de ligação inválido.");
                continue;
            }

            saldo -= valorAPagar;

            System.out.println("Saldo restante: " + saldo);
            System.out.println("Valor a pagar: " + valorAPagar);

            System.out.print("Deseja fazer outra ligação? (s/n): ");
            continuar = sc.next().charAt(0);
        }

        System.out.println("Obrigado por usar a operadora Vai-Vai!");

        sc.close();
    }
}
