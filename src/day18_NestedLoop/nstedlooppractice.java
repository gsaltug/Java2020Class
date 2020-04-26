package day18_NestedLoop;

import java.util.Scanner;

public class nstedlooppractice {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

    while(true){
        System.out.println("Enter two numbers:");
        String num1=input.next();
        String num2=input.next();

        System.out.println("Addition:"+(num1+num2));
        System.out.println("Do you want to continue?");
        String answer =input.next();
        while (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("No"))){
            System.out.println("Invalid entry, please re-enter, do you want to continue");//its gonna repeat the step over and over again.
            answer =input.next();
        }
        if(answer.equalsIgnoreCase("No")){
            System.out.println("Thank you for using the calculator");
            break;
        }

    }






    }
}
