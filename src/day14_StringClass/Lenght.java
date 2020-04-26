package day14_StringClass;

import java.util.Scanner;

public class Lenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println("Enter third word");
        String word3 = input.next();

        int lenght1 = word1.length();
        int lenght2 = word2.length();
        int lenght3 = word3.length();

        boolean allnotsame = lenght1 != lenght2 && lenght2!=lenght3&& lenght1!=lenght3;

        if(lenght1 == lenght2 && lenght2== lenght3){
            System.out.println("All words are same lenght");
        }else if (allnotsame){
            System.out.println("All different lenght");
        }else{
            System.out.println("Neither same nor different lenght");
        }


    }
}
