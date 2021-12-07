package dzien3;

import java.util.Scanner;

public class WhileShowcase {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Wpisz liczbe:");
        int scanned = myScanner.nextInt();

        while (scanned > 0) {
            System.out.println("Jestem w while, a to co wpisales, to: " + scanned);
            System.out.println("Wpisz liczbe:");
            scanned = myScanner.nextInt();
        }
        // while moze wykonac sie od 0 do n razy

        /* powyzej wersja while, ponizej wersja do...while */

        // do...while wykonac sie od 1 do n razy
        int scanned2;
        do {
            System.out.println("Wpisz liczbe:");
            scanned2 = myScanner.nextInt();

            for (int i = scanned2 - 1; i >= 0; i--) {
                System.out.println(i);
            }

        } while (scanned2 > 0);

        System.out.println("Jestemy po petlach while i do..while");


        myScanner.nextLine();
        String sentence = myScanner.nextLine();

        while (true) {
            System.out.println(sentence);
            sentence = myScanner.nextLine();
            if (sentence.equals("quit")) {
                break;
            }
        }

    }
}
