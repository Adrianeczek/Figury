package wsb.Adrian13966;

import java.util.Scanner;

public class Figury13966 {

    public static void main(String[] args) {
        System.out.println("Aplikacja Adriana do obsługi figur płaskich.");
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        Trojkat trojkat = new Trojkat();
        Prostokat prostokat = new Prostokat();
        Kwadrat kwadrat = new Kwadrat();
        Wymiary wymiary = new Wymiary();
        while (isTrue) {

            System.out.println("Wybierz figurę: ");
            System.out.println("1. Trójkąt ");
            System.out.println("2. Prostokąt");
            System.out.println("3. Kwadrat");
            System.out.println("4. Wyświetld wprowadzone dane.");
            System.out.println("5. Zakończ program.");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> trojkat.WymiaryTrojkata();
                case 2 -> prostokat.WymiaryProstokata();
                case 3 -> kwadrat.WymiaryKwadratu();
                case 4 -> wymiary.Wymiary();
                case 5 -> isTrue = false;

            }
        }
    }
}
