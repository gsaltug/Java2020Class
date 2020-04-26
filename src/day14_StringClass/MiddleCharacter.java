package day14_StringClass;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your word:");
        String word = input.next();

        int length = word.length();
        String middleCaharcter = "";
        int middlenumber = length/2;

        if(length % 2 !=0){
            middleCaharcter += word.charAt(middlenumber);
        }else{
            middleCaharcter += word.charAt(middlenumber-1)+word.charAt(middlenumber);
        }


        System.out.println(middleCaharcter);


    }
}
