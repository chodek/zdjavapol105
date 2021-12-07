package dzien2;

import java.math.BigDecimal;

public class TypeConvertions {

    public static void main(String[] args) {

        byte hundred = 100;
        short shortHundred = hundred;


        short thousand = 1000;
        byte thousandByte = (byte) thousand;
        System.out.println(thousandByte);


        byte three = 3;
        byte two = 2;
        short shortResult = (short) (three + two);


    }
}
