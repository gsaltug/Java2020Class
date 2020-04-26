package day15_forLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = scan.next();
        //String str = "Java";
      //  String reverse1 = " " + str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);

 String reverse2="";



        int lastindex = word.length()-1;
        System.out.println(lastindex);
        for (int i = lastindex; i >= 0; i--) {
          reverse2 += word.charAt(i);


                System.out.println(reverse2);
            }
        }
        //System.out.println(reverse2);//avaJ

        //Write a program to identify  if a string palindrome or not. if yes==true, or false
        //level==>level==>palindrome
    }
