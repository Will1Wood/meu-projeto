package teste8;
import java.util.*;;

public class Teste8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma distancia em metros: ");

        double distancia = scanner.nextDouble();

        double KiloMetro = distancia / 1000;
        double HectoMetro = distancia / 100;
        double DecaMetro = distancia / 10;
        double DeciMetro = distancia * 10;
        double CentiMetro = distancia * 100;
        double MiliMetro = distancia * 1000;

        System.out.println(KiloMetro + "Km");
        System.out.println(HectoMetro + "Hm");
        System.out.println(DecaMetro + "Dam");
        System.out.println(DeciMetro + "dm");
        System.out.println(CentiMetro + "cm");
        System.out.println(MiliMetro + "mm");
    }
}
