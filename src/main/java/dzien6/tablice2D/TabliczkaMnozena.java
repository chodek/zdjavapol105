package dzien6.tablice2D;


import java.util.Scanner;

public class TabliczkaMnozena {
    public static void main(String[] args) {
        int n = wczytajLiczbeOdUsera();
        int m = wczytajLiczbeOdUsera();
        int[][] tabliczka = stworzTabliczkeMnozeniaNnaM(n, m);
        wypiszTablice2D(tabliczka);
    }

    public static int wczytajLiczbeOdUsera() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        int wczytana = scanner.nextInt();
        return wczytana;
    }


    public static void wypiszTablice2D(int[][] tablicaDoWypisania) {


        for (int i = 0; i < tablicaDoWypisania.length; i++) {
            for (int j = 0; j < tablicaDoWypisania[i].length; j++) {
                System.out.print(tablicaDoWypisania[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] stworzTabliczkeMnozeniaNnaM(int n, int m) {
        int[][] tabliczka = new int[n][m]; // stworzenie tablicy 2D

        for (int i = 0; i < tabliczka.length; i++) {
            for (int j = 0; j < tabliczka[i].length; j++) {
                tabliczka[i][j] = (i + 1) * (j + 1);
            }
        }

        return tabliczka;
    }


}
