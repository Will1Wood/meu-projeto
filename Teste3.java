package teste3;
import java.util.*;

public class Teste3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String name = scanner.nextLine();

        System.out.println("Digite o salario: ");
        double salario = scanner.nextDouble();

        System.out.println("Nome do funcionario: " + name);
        System.out.println("Salario: " + salario);
        System.out.println("O funcionario " + name + " tem um salario de R$" + salario + " em junho");
    }
}
