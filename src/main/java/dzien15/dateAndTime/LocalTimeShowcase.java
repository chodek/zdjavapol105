package dzien15.dateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class LocalTimeShowcase {

    public static void main(String[] args) {

        LocalTime someTime = LocalTime.now();
        System.out.println("Obecny czas to: " + someTime);

        someTime = someTime
                .withHour(15)
                .withMinute(30)
                .withSecond(26);

        System.out.println(someTime);

        someTime = someTime.plusSeconds(100);
        someTime = someTime.minusHours(1);


        someTime.getSecond();
        someTime.getLong(ChronoField.MILLI_OF_DAY);


    }
}
