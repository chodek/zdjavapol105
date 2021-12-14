package helper;

import java.util.Scanner;

public class DataLoader {

    public static String loadStringFromUser() {
        System.out.println("Podaj prosze text:");
        return new Scanner(System.in).nextLine();
    }

    public static int loadIntFromUser() {
        System.out.println("Podaj prosze liczbe (int):");
        return new Scanner(System.in).nextInt();
    }

}
