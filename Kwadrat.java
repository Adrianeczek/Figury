package wsb.Adrian13966;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kwadrat {
    private List<Double> kwadrat = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void WymiaryKwadratu() {
        System.out.println("Podaj długość boku kwadratu. ");
        double a = scanner.nextDouble();
        kwadrat.add(a);
        if (a > 0){
            System.out.println("Obwód twojego kwadrata wynosi " + (4*a));
        } else {
            System.out.println("Taki kwadrat nie może istnieć , nie spełnia warunków.");
        }
    }
    public List<Double> pokazWymiarKwadratu() {
        System.out.println("Wprowadziłeś następujące dane.\nKwadrat:");
        return kwadrat;
    }
}
