package day21_multidimensionalArray;

import java.util.Scanner;

public class Replits2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];


        //write your code below
        int maxlengthString = words [0].length();//I will compare it with remaining
        String longestword ="";
        //int=1, started from second word to compare w/first
        for(int i=0; i<words.length; i++){
            if(words[i].length()> maxlengthString){
                maxlengthString=words[i].length();
                longestword=words[i];
            }
        }
        System.out.println(longestword);
    }
}






