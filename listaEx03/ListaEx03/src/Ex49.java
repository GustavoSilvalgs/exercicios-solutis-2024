public class Ex49 {
    public static void main(String[] args) {
        //49. Exiba os 50 primeiros números da seqüência de Fibonacci
        //(1,1,2,3,5,8,13,21,34,55,89,144,233,377,...).
        int n = 50;

        long primeiroTermo = 1;
        long segundoTermo = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        System.out.print(primeiroTermo + ", " + segundoTermo);

        for (int i = 3; i <= n; i++) {
            long proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(", " + proximoTermo);

            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println();
    }
}
