package day17_WhileLoop;

import java.util.Scanner;
//min-max number
public class WarmUp_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber =-9999999;//any number the user provided will be greater than this number
        for(int i=1;i<6;i++ ){
            System.out.println("Enter Number:");
            int num=input.nextInt();

        if(num>maxNumber){//checks each of the number respectively.
            maxNumber=num;
        }


        }
        System.out.println(maxNumber);
    }
}
