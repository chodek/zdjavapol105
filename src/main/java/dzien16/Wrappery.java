package dzien16;

import java.util.Scanner;

public class Wrappery {

    int wiek;
    Integer ilosc;

    public static void main(String[] args) {

        long wartosc = 1_000_000_000L;
        System.out.println(wartosc);

        byte byteValue = 5_6;

        Byte byteObject = new Byte(byteValue);
        Byte bytzObject = byteObject;

        short shortValue = 123;
        Short shortObject = new Short(shortValue);
        Short shortObject2 = 12;


        int intValue = 235;
        Integer inteObject = new Integer(235);
        Integer intObject = 5;

        int someValue = new Integer(544356);


        Integer object = null;
        int unboxed = object;


        if (intValue != byteObject) {
            System.out.println();
        }


    }

}
