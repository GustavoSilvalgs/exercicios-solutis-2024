import java.util.Random;

public class Ex34 {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 50 ; i++) {
            int randomNumber = rand.nextInt(1,101);
            System.out.println(randomNumber);
        }
    }
}
