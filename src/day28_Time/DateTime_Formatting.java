package day28_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {
        LocalDateTime datetime1 = LocalDateTime.of(2015, 12, 25, 23, 30, 45);

        System.out.println(datetime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEE, MM/dd hh:mm a");

        String str = datetime1.format(dtf);

        System.out.println(str);
    }
}
