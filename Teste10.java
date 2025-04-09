package teste10;
import java.io.SyncFailedException;
import java.util.*;

public class Teste10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;

        double qtdTinta = 0.5 * area;

        System.out.println("Area: " + area);
        System.out.println("Quantidade de tinta: " + qtdTinta + "l");
    }
}
