package dzien15.dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {

        LocalDateTime localDateTime= LocalDateTime.now();
        String formattedLocalTime = localDateTime.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(formattedLocalTime); // 21:11:00.024


        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.YYYY*MM"));
        System.out.println(date);
    }
}

