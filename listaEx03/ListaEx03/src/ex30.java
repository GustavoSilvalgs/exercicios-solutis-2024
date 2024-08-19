
import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas do vértice inferior esquerdo e superior direito do primeiro retângulo (x1 y1 x2 y2):");
        int x1_1 = sc.nextInt();
        int y1_1 = sc.nextInt();
        int x2_1 = sc.nextInt();
        int y2_1 = sc.nextInt();

        System.out.println("Digite as coordenadas do vértice inferior esquerdo e superior direito do segundo retângulo (x1 y1 x2 y2):");
        int x1_2 = sc.nextInt();
        int y1_2 = sc.nextInt();
        int x2_2 = sc.nextInt();
        int y2_2 = sc.nextInt();

        int minX1 = Math.min(x1_1, x2_1);
        int maxX1 = Math.max(x1_1, x2_1);
        int minY1 = Math.min(y1_1, y2_1);
        int maxY1 = Math.max(y1_1, y2_1);

        int minX2 = Math.min(x1_2, x2_2);
        int maxX2 = Math.max(x1_2, x2_2);
        int minY2 = Math.min(y1_2, y2_2);
        int maxY2 = Math.max(y1_2, y2_2);

        boolean intersect = !(maxX1 < minX2 ||
                minX1 > maxX2 ||
                maxY1 < minY2 ||
                minY1 > maxY2);

        if (intersect) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
    }
}