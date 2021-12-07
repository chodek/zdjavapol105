package dzien10.zadanie5Stringi;

import java.util.Scanner;

public class CharactersCounter {

    public static void main(String[] args) {
        String loadedString = loadStringFromUser();
        countAndPrintCharacterOccurences(loadedString);
    }

    private static void countAndPrintCharacterOccurences(String loadedString) {
        int[] characterOccurances = new int[58];
        for (int i = 0; i < loadedString.length(); i++) {
            int valueOfCharacter = loadedString.charAt(i);
            characterOccurances[valueOfCharacter - 65] += 1;
        }



    }

    private static String loadStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
