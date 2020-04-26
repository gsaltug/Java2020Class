package day21_multidimensionalArray;

import java.util.Scanner;

public class StringLongest {
    public static void main(String[] args) {
   //Write a program that can return longest String

   String [] names = {"gozde","emrah","lina","Bilgenur"};

   int maxlengthString = names [0].length();//I will compare it with remaining
   String longestword ="";
        //int=1, started from second word to compare w/first
   for(int i=0; i<names.length; i++){
       if(names[i].length()> maxlengthString){
           maxlengthString=names[i].length();
           longestword=names[i];
       }
   }
        System.out.println(longestword);

    }
}
