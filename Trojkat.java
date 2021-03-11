package wsb.Adrian13966;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trojkat {
    private List<Double> trojkat = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void WymiaryTrojkata() {
        System.out.println("Podaj długości boków tego trójkąta ");
        double a = scanner.nextDouble();
        trojkat.add(a);
        double b = scanner.nextDouble();
        trojkat.add(b);
        double c = scanner.nextDouble();
        trojkat.add(c);
        if ((a+b>c) && (b+c>a) && (a+c>b) && a > 0 && b > 0 && c > 0) {
            System.out.println("Obwód twojego trójkąta to: " + (a +b +c) );
        } else {
            System.out.println("Taki trójkąt nie może istnieć , nie spełnia warunków.");
        }
    }
    public List<Double> pokazWymiarTrojkata(){
        System.out.println("Wprowadziłeś następujące dane.\nTrójkąt:");
        return trojkat;
    }


}
