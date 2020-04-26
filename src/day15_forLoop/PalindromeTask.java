package day15_forLoop;

import java.util.Scanner;


public class PalindromeTask {
    public static void main(String[] args) {
        //Write a program to identify  if a string palindrome or not. if yes==true, or false
        //level==>level==>palindrome
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your word");
        String word = input.next();
;
        String reverse = "";

        int maxindex = word.length() - 1;
        for (int i = maxindex; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        boolean result = word.equalsIgnoreCase(reverse);

        if (result) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");
        }
    }
}
