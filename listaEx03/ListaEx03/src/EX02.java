import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

         System.out.print("digite seu salario: ");
         double salarioFuncionario = sc.nextDouble();

         System.out.print("digite o salario minimo: ");
         double salarioMinimo = sc.nextDouble();

         double quantidade = salarioFuncionario / salarioMinimo ;

         System.out.printf("você recebe aproximadamente, %.2f salários minimos %n ", quantidade);


         sc.close();
    }
}
