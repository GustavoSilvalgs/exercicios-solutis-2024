
import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice superior esquerdo (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Digite as coordenadas do vértice inferior direito (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (x1 == x2 && y1 == y2) {
            System.out.println("É um ponto.");
        } else if (x1 == x2) {
            System.out.println("É uma reta vertical.");
        } else if (y1 == y2) {
            System.out.println("É uma reta horizontal.");
        } else {
            System.out.println("É um retângulo.");
            int width = Math.abs(x2 - x1);
            int height = Math.abs(y2 - y1);
            int area = width * height;
            System.out.println("A área do retângulo é: " + area);
        }

        System.out.println("Digite as coordenadas do ponto (px py):");
        int px = sc.nextInt();
        int py = sc.nextInt();

        if (px < Math.min(x1, x2)) {
            if (py < Math.min(y1, y2)) {
                System.out.println("Acima e à esquerda");
            } else if (py > Math.max(y1, y2)) {
                System.out.println("Embaixo e à esquerda");
            } else {
                System.out.println("À esquerda");
            }
        } else if (px > Math.max(x1, x2)) {
            if (py < Math.min(y1, y2)) {
                System.out.println("Acima e à direita");
            } else if (py > Math.max(y1, y2)) {
                System.out.println("Embaixo e à direita");
            } else {
                System.out.println("À direita");
            }
        } else {
            if (py < Math.min(y1, y2)) {
                System.out.println("Acima");
            } else if (py > Math.max(y1, y2)) {
                System.out.println("Embaixo");
            } else if (px == Math.min(x1, x2) || px == Math.max(x1, x2) || py == Math.min(y1, y2) || py == Math.max(y1, y2)) {
                System.out.println("Na linha do retângulo");
            } else {
                System.out.println("Dentro do retângulo");
            }
        }
    }
}