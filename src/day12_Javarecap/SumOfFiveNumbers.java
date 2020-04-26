package day12_Javarecap;

import java.util.Scanner;

public class SumOfFiveNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter five numbers: ");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        double n5 = input.nextDouble();

        double sum = 0;

        if(n1>0){
            sum += n1;
        }
        if(n2>0){
            sum += n2;
        }
        if(n3>0){
            sum += n3;
        }
        if(n4>0){
            sum += n4;

        }
        if(n5>0){
            sum += n5;
        }

        System.out.println(sum);

   //TASK: Write a program that asks to enter 5 numbers and prints in ascending order.

    }

}
