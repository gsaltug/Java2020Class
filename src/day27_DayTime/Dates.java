package day27_DayTime;

import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020, 10, 25);
        System.out.println(date1);


        LocalDate birthday = LocalDate.of(1988, 05, 02);
        System.out.println(birthday);

        //isAfter(date2)
     boolean   result1 = date1.isAfter(birthday);
        System.out.println(result1); //true
//isBefore
        boolean result2 =date1.isBefore(birthday);
        System.out.println(result2);//false

        //isEqual()

        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);//false

        //isLeapyear

        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);//true

        System.out.println("==========================");

        LocalDate now = LocalDate.now();
        System.out.println(now); //2020-04-23

        String str = now.toString();
        System.out.println(str.replace("-", ""));

    LocalDate birthday2 = LocalDate.of(1990, 04, 25);
    int month = birthday2.getMonthValue();
    int days = birthday2.getDayOfMonth();
    int year = birthday2.getYear();
    }



}
