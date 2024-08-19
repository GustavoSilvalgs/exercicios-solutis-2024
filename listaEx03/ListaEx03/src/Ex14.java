import java.util.HashMap;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> meses = new HashMap<>();

        meses.put("janeiro", 1);
        meses.put("fevereiro", 2);
        meses.put("marco", 3);
        meses.put("abril", 4);
        meses.put("maio", 5);
        meses.put("junho", 6);
        meses.put("julho", 7);
        meses.put("agosto", 8);
        meses.put("setembro", 9);
        meses.put("outubro", 10);
        meses.put("novembro", 11);
        meses.put("dezembro", 12);

        System.out.print("Digite o nome de um mês: ");
        String nomeMes = sc.nextLine().toLowerCase();

        if (meses.containsKey(nomeMes)) {
            int numeroMes = meses.get(nomeMes);
            System.out.println("O número equivalente do mês " + nomeMes + " é: " + numeroMes);
        } else {
            System.out.println("Mês inválido. Tente novamente.");
        }
    }
}
