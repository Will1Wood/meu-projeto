package teste5;
import java.util.*;

public class Teste5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextInt();

        double media = (nota1 + nota2)/2;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("A média entre " + nota1 + " e " + nota2 + " é igual a " + media);
    }
}
