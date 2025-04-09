package teste9;
import java.text.DecimalFormat;
import java.util.*;

public class Teste9 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#.##"); // Formatar para duas casas decimais

       System.out.print("Digite a quantia de dinheiro (em R$): ");
       double dinheiro = scanner.nextDouble();

       double taxaDeCambio = 3.45;  // Exemplo fixo, pode ser atualizado
       double dolares = dinheiro / taxaDeCambio;

       System.out.println("Dólares: $" + df.format(dolares));

       scanner.close(); // Fechar o Scanner para evitar vazamento de recursos
   }
    
}
