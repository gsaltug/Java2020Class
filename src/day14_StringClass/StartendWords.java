package day14_StringClass;

import java.util.Scanner;

public class StartendWords {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter first word");
        String word1 = input.next();

        System.out.println("Please enter second word");
        String word2 = input.next();

        int lenght1 = word1.length();
        int lenght2 = word1.length();

        if(lenght1 == 5 && lenght2 == 5){
            if(word1.charAt(lenght2-1)==word2.charAt(0)){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }

        }else{
            System.out.println("need to be exactly 5 chars lenght");
        }

        /*
        must have 5 cahr., last letter of word1 must be equal to first letter of word1
         */
    }
}
