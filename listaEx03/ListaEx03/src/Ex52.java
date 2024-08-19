public class Ex52 {
    public static void main(String[] args) {
        //52. A história do rei que e tornou pobre: após perder uma aposta com um súdito, ele teve que
        //pagar uma quantia muito grande em sacos de arroz. A aposta feita anteriormente era que
        //se o súdito ganhasse o rei teria que pagar um grão de arroz colocado na primeira casa de
        //um tabuleiro de xadrez. Na segunda casa teria que pagar o dobro, ou seja, dois grãos de
        //arroz, e assim sucessivamente até a casa número 64. Exiba quantos grãos de arroz este
        //súdito teria que ganhar, somando todas as 64 casas.
        //Depois tente exibir a quantia de sacos de arroz?

        int casas = 64;
        long totalArroz = 0;
        long graosNaCasa = 1;

        for (int i = 1; i <= casas; i++) {
            totalArroz += graosNaCasa;
            graosNaCasa *= 2;
        }

        System.out.println("O súdito ganharia um total de " + totalArroz + " grãos de arroz.");


        double graosPorSaco = 64000;
        double quantidadeSacos = totalArroz / graosPorSaco;

        System.out.println("Isso equivale a aproximadamente " + quantidadeSacos + " sacos de arroz.");

    }
}
