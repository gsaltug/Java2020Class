package day27_DayTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MMM/dd/yyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));//2020/04/23
        System.out.println(date1.format(dtf1));//Apr/23/2020

        /*
        create a day called birthday : MMM/Days/year
         */

        LocalDate birtday = LocalDate.of(2018, 05, 02);
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yyy");
        System.out.println(birtday.format(dtf3));


        LocalDate date4 = LocalDate.now();
        System.out.println(date4.format(dtf3)); //Thu Apr/23/2020 with E-EEE  //Thursday Apr/23/2020 with EEEE
    }
}
