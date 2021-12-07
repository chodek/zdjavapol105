package dzien8.pokaz;

import java.util.Random;

public class PokazRandom {
    public static void main(String[] args) {

        Random random = new Random();


        /*for (int i = 0; i < 1000; i++) {
            System.out.println(random.nextInt(21) - 10);
        }*/

        for (int i = 0; i < 1000; i++) {
            System.out.println(random.nextDouble() * 10 + 10);
        }

        wylosujZZakresu(15,50);


    }

    private static int wylosujZZakresu(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
