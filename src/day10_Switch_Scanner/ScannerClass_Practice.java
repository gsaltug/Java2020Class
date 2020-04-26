package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerClass_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
      byte num1  = input.nextByte(); //it will allow to user
        System.out.println("Enter your second number");
        byte num2 = input.nextByte();
        System.out.println("The sum of those two numbers are:" +(num1+num2));
//or int total = (num1+num2);
        System.out.println("==============================");
        //SHORT Primitive
        System.out.println("Enter third number");
        short num3 = input.nextShort();
        System.out.println("Enter fourth number");
        short num4 =input.nextShort();
        System.out.println("The sum of"+num3+"and"+num4+"is"+ (num3+num4));
    }
}
/*
Write a program that ask user to enter num1 and num2.
 */