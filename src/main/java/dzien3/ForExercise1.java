package dzien3;

import java.util.Scanner;

public class ForExercise1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int number = myScanner.nextInt();
        System.out.println("Podaj dzielnik: ");
        int divider = myScanner.nextInt();

        for (int i = number - 1; i > 0; i--) {
            if (i % divider == 0) {
                System.out.println(i);
            }
        }


        // 2 ^ 4 = 2 * 2 * 2 * 2


        int n = 2, m = 4;
        int wynik = 1;
        for (int i = 0; i < m; i++) {
            wynik = wynik * n;
        }


        System.out.println(wynik);

    }
}
