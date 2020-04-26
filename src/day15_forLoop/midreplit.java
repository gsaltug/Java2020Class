package day15_forLoop;

import java.util.Scanner;

public class midreplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your word1");
        String word1 = scan.next();
        System.out.println("Enter your word2");
        String word2 = scan.next();

        //WRITE YOUR CODE HERE
        int length1 = word1.length();
        int length2 = word2.length();


        if(length1!=3 || length2!=3){
            System.out.println("cannot merge");


        }else{
            System.out.println(""+word1.charAt(0)+(word2.charAt(0))+(word1.charAt(1))+(word2.charAt(1))+(word1.charAt(2))+(word2.charAt(2)));
        }



    }}