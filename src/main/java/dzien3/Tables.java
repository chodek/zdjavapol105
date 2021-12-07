package dzien3;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {


        int zmiennaZJednymIntem = 10;

        int[] zmiennaNaTablice = new int[5];
        int[] zmiennaNaTablice2 = new int[]{154, 152, 464};


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] tablicaOWielkosciOdN = new int[n];


        zmiennaNaTablice[0] = 123;
        zmiennaNaTablice[1] = 657;
        zmiennaNaTablice[2] = 362356;
        zmiennaNaTablice[3] = 36432;
        zmiennaNaTablice[4] = 9876;
        zmiennaNaTablice[5] = 26346;
        zmiennaNaTablice[6] = 15467;

        System.out.println(zmiennaNaTablice);


        for (int i = 0; i < zmiennaNaTablice.length; i++) {
            System.out.println(zmiennaNaTablice[i]);
        }

    }
}
