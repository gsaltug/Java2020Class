package day14_StringClass;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Write java to display the middle character of a string, if the lenght of string is even there will be two mid cha.
        //if lenght of string is odd there will be one mid cha.
        System.out.println("Enter a word");

        String word = input.next();
        String middleCha = " ";

        int totalChar = word.length();
        int middleNumber = totalChar / 2;

        if (totalChar % 2 != 0) {//odd numbers
            middleCha += word.charAt(middleNumber);

        }else{
            middleCha = middleCha+word.charAt(middleNumber-1)+word.charAt(middleNumber);
        }

        System.out.println(middleCha);
    }
}
