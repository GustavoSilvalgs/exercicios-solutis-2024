import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        //51. Exiba os n primeiros termos da seqüência de
        // Tribonacci (soma dos três anteriores). Inicia
        //com 1,1 e 2.

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos termos você deseja na sequência de Tribonacci? ");
        int n = sc.nextInt();
        int a = 1, b = 1, c = 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        for (int i = 3; i < n; i++) {
            int d = a + b + c;
            System.out.println(d);
            a = b;
            b = c;
            c = d;
        }
        sc.close();
    }
}
