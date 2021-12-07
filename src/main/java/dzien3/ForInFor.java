package dzien3;

import dzien11.Cat;

import java.util.Scanner;

public class ForInFor {
    public static void main(String[] args) {

        int value;
        value = loadIntFromUser();

        printTriangleWithSizeN(value);
        printSquareWithSizeN(value);

        // printTriangleWithSizeN(loadIntFromUser());

    }

    public static void printSquareWithSizeN(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printTriangleWithSizeN(int n) {
        for (int i = 0; i <= n; i++) {

            // petla rysujaca spacje
            for (int k = n; k > i; k--) {
                System.out.print("  ");
            }
            // petla rysujaca gwiazdki
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int loadIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe calkowita:");
        // return scanner.nextInt(); <- krotsza werjsa dwoch linii ponizej
        int loaded = scanner.nextInt();
        return loaded;
    }
}