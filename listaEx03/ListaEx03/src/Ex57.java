import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Recebendo a primeira data no formato dd/mm/yyyy
        System.out.print("Digite a primeira data (dd/mm/yyyy): ");
        String[] dataInicio = scan.nextLine().split("/");
        int diaInicio = Integer.parseInt(dataInicio[0]);
        int mesInicio = Integer.parseInt(dataInicio[1]);
        int anoInicio = Integer.parseInt(dataInicio[2]);

        // Recebendo a segunda data no formato dd/mm/yyyy
        System.out.print("Digite a segunda data (dd/mm/yyyy): ");
        String[] dataFim = scan.nextLine().split("/");
        int diaFim = Integer.parseInt(dataFim[0]);
        int mesFim = Integer.parseInt(dataFim[1]);
        int anoFim = Integer.parseInt(dataFim[2]);

        System.out.println("Datas entre " + diaInicio + "/" + mesInicio + "/" + anoInicio +
                " e " + diaFim + "/" + mesFim + "/" + anoFim + ":");

        for (int ano = anoInicio; ano <= anoFim; ano++) {
            int mesInicial = (ano == anoInicio) ? mesInicio : 1;
            int mesFinal = (ano == anoFim) ? mesFim : 12;

            for (int mes = mesInicial; mes <= mesFinal; mes++) {
                int diaInicial = (ano == anoInicio && mes == mesInicio) ? diaInicio : 1;
                int diaFinal = (ano == anoFim && mes == mesFim) ? diaFim : diasNoMes(mes, ano);

                for (int dia = diaInicial; dia <= diaFinal; dia++) {
                    System.out.println(dia + "/" + mes + "/" + ano);
                }
            }
        }

        scan.close();
    }

    public static int diasNoMes(int mes, int ano) {
        switch (mes) {
            case 4, 6, 9, 11 -> {
                return 30;
            }
            case 2 -> {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            default -> {
                return 31;
            }
        }
    }
}
