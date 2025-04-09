package teste2;
import java.util.*;

public class Teste2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nome? ");
        String name = scanner.nextLine();

        System.out.println("Olá " + name + ", é um prazer te conhecer!");
    }
}
