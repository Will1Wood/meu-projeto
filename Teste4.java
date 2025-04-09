package teste4;
import java.util.*;

public class Teste4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int soma = num1 +num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + soma);
    }
}
