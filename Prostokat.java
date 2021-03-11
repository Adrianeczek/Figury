package wsb.Adrian13966;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prostokat {
    private List<Double> prostokat = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void WymiaryProstokata() {
        System.out.println("Podaj długości boków prostokąta: ");
        double a = scanner.nextDouble();
        prostokat.add(a);
        double b = scanner.nextDouble();
        prostokat.add(b);
        if ((a > 0) && (b > 0)) {
            System.out.println("Obwód twojego prostokąta wynoszą: " + ((2*a) + (2*b)));
        } else {
            System.out.println("Taki prostokąt nie może istnieć , nie spełnia warunków.");
        }
    }
    public List<Double> pokazWymiarProstokata () {
        System.out.println("Wprowadziłeś następujące dane.\nProstokąt:");
        return prostokat;
    }
}
