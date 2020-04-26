package day14_StringClass;

import java.util.Scanner;

public class day14_StringClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter first word:");
        String word1 = input.next();

        System.out.println("Enter second word:");
        String word2 =input.next();

        /*
        print one two two one
         */
        String result = word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result);

        System.out.println("Enter first word:");
        String word3 = input.next();
          word3= word3.substring(1, word3.length());
        System.out.println("Enter second word:");
        String word4 = input.next();
        word4 = word4.substring(1, word4.length());

        String result1 =word3+word4;
        System.out.println(result1);



    }
}
