package day28_Time;

import java.time.LocalDate;

public class Warmup_birthday {
    public static void main(String[] args) {
        String friends[] = {"Abdul", "Baris", "Sayed", "Parida", "Irina"};
        LocalDate[] birthdays = {LocalDate.of(1990, 1, 1),
                LocalDate.of(1991, 2, 2),
                LocalDate.of(1992, 3, 3),
                LocalDate.of(1993, 4, 4),
                LocalDate.of(1994, 5, 5),
        };
        for (int i = 0; i < friends.length; i++) {
            System.out.println(friends[i] + " -- " + birthdays[i]);
        }
    }

}
/*
public class warmUp {
    public static void main(String[] args) {
        String [] arr={"Marionella", "Gary", "Amir", "Millica", "Gamze"};
        LocalDate [] birthdays={LocalDate.of(1995,12,12),LocalDate.of(1990,11,14),LocalDate.of(1987,03,06),LocalDate.of(1999,06,17),LocalDate.of(1998,07,10)};
  int k=0;
        for (String each:arr){
            System.out.println(each+" "+birthdays[k]);
            k++;
  }
    }
 */