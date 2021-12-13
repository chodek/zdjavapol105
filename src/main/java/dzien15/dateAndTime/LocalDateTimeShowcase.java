package dzien15.dateAndTime;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class LocalDateTimeShowcase {

    public static void main(String[] args) {


        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2021,2,17,22,12);

        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        System.out.println(localDateTime.toEpochSecond(ZoneOffset.UTC));
    }
}
