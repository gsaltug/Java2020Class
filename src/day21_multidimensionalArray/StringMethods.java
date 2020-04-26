package day21_multidimensionalArray;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name ="Java";

        char [] chars = name.toCharArray();

        System.out.println(chars[0]);//'J
        System.out.println(chars[3]);//error since it's greater than max index num (3).


        String str ="I like Java";

       String [] arr= str.split(" ");

        System.out.println(Arrays.toString(arr)); //[I, like, Java]

    String sentence ="Today is great day";

    String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Today, is, great, day]
String result=" ";
        for (int i=words.length-1; i>=0;i--){
           String eachwords = words [i];
            //System.out.print(eachwords+" ");//day great is Today
        result += eachwords+" ";

        }
        System.out.println(result);// day great is Today

        String str2 = "ABCDEFG";
        //[A, B.....

        String charac [] = str2.split("");

        System.out.println(Arrays.toString(charac));//[A, B, C, D, E, F, G] string data type

        char [] ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch2));//[A, B, C, D, E, F, G] char data type
    }
}
