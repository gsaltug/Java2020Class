package day20ArrayCon;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] days ={"Monday","Tue","Wed","Thu","Fri","Sat","Sun"};
        System.out.println("Enter a number: ");
        int num =input.nextInt();

        int attempt =0;
        while(num>7 || num<=0){
            System.out.println("Invalid number");
            System.out.println("Please re-enter");
            num=input.nextInt();
            attempt++;

            if(attempt>3 && (num>7 || num<=0)){
                System.out.println("Invalid entry");
                System.exit(0);
            }
        }

        String result = days[num-1];

        System.out.println(result);
    }
}
