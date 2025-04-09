package teste7;
import java.util.*;

public class Teste7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero: ");

        double numero = scanner.nextDouble();

        double dobro = numero * 2;

        double tercaparte = numero / 3;

        System.out.println("O dobro de " + numero + " é " + dobro);
        System.out.println("A terça parte de " + numero + " é " + tercaparte);
    }
}
