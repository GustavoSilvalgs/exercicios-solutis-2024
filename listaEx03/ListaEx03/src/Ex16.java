import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia de nascimento: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o número do mês de nascimento: ");
        int mes = scanner.nextInt();

        if (mes >= 1 && mes <= 12) {
            int maxDias = obterMaxDiasMes(mes);

            if (dia >= 1 && dia <= maxDias) {
                String nomeMes = obterNomeMes(mes);
                String trimestre = obterTrimestre(mes);

                System.out.println("Data de aniversário válida!");
                System.out.println("Mês: " + nomeMes);
                System.out.println("Trimestre: " + trimestre);
            } else {
                System.out.println("Dia de nascimento inválido para o mês selecionado.");
            }
        } else {
            System.out.println("Mês de nascimento inválido.");
        }

        scanner.close();
    }

    public static String obterNomeMes(int mes) {
        String[] nomesMeses = {
                "Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return nomesMeses[mes - 1];
    }

    public static int obterMaxDiasMes(int mes) {
        int[] maxDias = {
                31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };
        return maxDias[mes - 1];
    }

    public static String obterTrimestre(int mes) {
        if (mes >= 1 && mes <= 3) {
            return "1º trimestre";
        } else if (mes >= 4 && mes <= 6) {
            return "2º trimestre";
        } else if (mes >= 7 && mes <= 9) {
            return "3º trimestre";
        } else {
            return "4º trimestre";
        }
    }
}
