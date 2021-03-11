package wsb.Adrian13966;
import wsb.Adrian13966.Trojkat;
import wsb.Adrian13966.Prostokat;
import wsb.Adrian13966.Kwadrat;
import java.util.Scanner;

public class Wymiary {
    public void Wymiary() {
        Scanner scanner = new Scanner(System.in);
        Trojkat trojkat = new Trojkat();
        Prostokat prostokat = new Prostokat();
        Kwadrat kwadrat = new Kwadrat();
        System.out.println("Wymiary jakiej figury chcesz sprawdzić?");
        System.out.println("Wprowadź cyfrę.\n1.Trójkąt.\n2.Prostokąt.\n3.Kwadrat");
        int a = scanner.nextInt();

        switch (a) {
            case 1 -> System.out.println(trojkat.pokazWymiarTrojkata());
            case 2 -> System.out.println(prostokat.pokazWymiarProstokata());
            case 3 -> System.out.println(kwadrat.pokazWymiarKwadratu());
        }
    }
}
