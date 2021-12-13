package dzien15.dateAndTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class LocalDateShowcase {

    public static void main(String[] args) {

        LocalDate someDate = LocalDate.of(2022,1,20);
        LocalDate someDate2 = LocalDate.of(2022, Month.JANUARY, 26);

        System.out.println(someDate.getEra());


    }
}
