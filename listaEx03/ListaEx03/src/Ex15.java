import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        enum MesesDoAno {
            JANEIRO, FEVEREIRO, MARCO, ABRIL, MAIO, JUNHO, JULHO, AGOSTO, SETEMBRO, OUTUBRO, NOVEMBRO, DEZEMBRO
        }

        MesesDoAno mesDeAniversario;
        int diaInformado;
        int mesInformado;


        System.out.print("Digite o dia do aniversário: ");
        diaInformado = Integer.parseInt(scanner.next());
        System.out.print("Digite o mês do aniversário: ");
        mesInformado = Integer.parseInt(scanner.next());
        try {
            mesDeAniversario = MesesDoAno.values()[mesInformado - 1];

            switch (mesInformado) {
                case 4, 6, 9, 11 -> {
                    if (diaInformado >= 1 && diaInformado <= 30) {
                        System.out.printf("Data Válida! mes de aniversario: %s", mesDeAniversario.name());
                    } else {
                        System.out.println("Data inválida");
                    }
                }
                case 2 -> {
                    if (diaInformado >= 1 && diaInformado <= 29) {
                        System.out.printf("Data Válida! mes de aniversario: %s", mesDeAniversario.name());
                    } else {
                        System.out.println("Data inválida");
                    }
                }
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    if (diaInformado >= 1 && diaInformado <= 31) {
                        System.out.printf("Data Válida! mes de aniversario: %s", mesDeAniversario.name());
                    } else {
                        System.out.println("Data inválida");
                    }
                }
                default -> System.out.println("Data inválida!");
            }
        } catch (Exception e) {
            System.out.println("Data inválida!");
        }
    }
}
