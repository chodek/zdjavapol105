package dzien5;

import java.util.Scanner;

public class ZadanieZBledem {

    public static void main(String[] args) {
        int[] tabelOfInts = new int[4];

        for (int i = 0; i < 4; i++) {
            tabelOfInts[i] = i;
        }


        Scanner scanner = new Scanner(System.in);

        int value1 = scanner.nextInt();
        scanner.nextLine();




        int value2 = scanner.nextInt();
        String someString = scanner.nextLine();
        System.out.println(someString);
    }

}
