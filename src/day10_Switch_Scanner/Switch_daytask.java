package day10_Switch_Scanner;

public class Switch_daytask {
    public static void main(String[] args) {
        /*
        write a program to display days: 1-Monday...
         */

        int day = 2;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday"); //if we don't put break statement, it's gonna print Tuesday Wednesday and then exit.
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
/*
break statement is for exiting the case. If we don't close, it will continue to execute the case.
 */