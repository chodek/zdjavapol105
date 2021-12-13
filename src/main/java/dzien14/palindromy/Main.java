package dzien14.palindromy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fromUser = readString();
        System.out.println(isPalindormeSB(fromUser));
        System.out.println(isPalindorme(fromUser));

    }

    private static boolean isPalindorme(String toCheck) {
        char[] chars = toCheck
                .toLowerCase()
                .replaceAll(" ", "")
                .toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }


    private static boolean isPalindormeSB(String toCheck) {
        return toCheck
                .replaceAll(" ", "")
                .equalsIgnoreCase(new StringBuilder(toCheck).reverse().toString());
    }

    public static String readString() {
        System.out.println("Podaj prosze jakis tekst:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
