package day15_forLoop;

import java.util.Scanner;

public class Replit2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();
        //WRITE YOUR CODE HERE

        int length=word.length();
        int lastIndexNum=word.length()-1;
        String reverse="";
        if ( length==5){
            for (int i =lastIndexNum; i>=0; i--)
                reverse += word.charAt(i);
            System.out.println(reverse);
        } else if (length<=4){
            System.out.println("Too short!");
        } else  if (length>5){
            System.out.println("Too long!");
        }
    }
}
