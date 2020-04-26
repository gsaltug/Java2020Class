package day17_WhileLoop;

import java.util.Scanner;

public class WarmUp_minNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber =-9999999;
        int minNumber =999999999;//
        for(int i=1;i<6;i++ ){
            System.out.println("Enter Number:");
            int num=input.nextInt();

            if(num<minNumber){//checks each of the number respectively.
                minNumber=num;
            }
            if(num>maxNumber){//checks each of the number respectively.
                maxNumber=num;
            }

        }
        System.out.println(minNumber);
        System.out.println(maxNumber);
    }

    }

