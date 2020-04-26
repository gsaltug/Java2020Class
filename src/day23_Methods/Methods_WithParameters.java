package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your age");
        byte age = scan.nextByte();


        eligibleToBuyAlcohol((byte)45);  //age=argument extra info passed here.


    }



    public static void eligibleToBuyAlcohol(int age){//you can use any primitives, any objects, you can do casting also.

        if(age >=21){
            System.out.println("Eligible to by alcohol");
        }else{
            System.out.println("Eligible to buy milk");
        }

    }
}
