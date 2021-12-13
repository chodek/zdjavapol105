package dzien15.dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalField;

public class PeriodAndDuriation {

    public static void main(String[] args) {

        System.out.println(Duration.ofHours(10).toMinutes());

        System.out.println(Duration.between(LocalDateTime.now(), LocalDateTime.now().plusDays(2)).toMinutes());

        System.out.println(Period.between(LocalDate.of(2019, 11, 30), LocalDate.now()));

        System.out.println(ChronoUnit.DAYS.between(LocalDate.of(2019, 11, 30), LocalDate.now()));


    }
}
