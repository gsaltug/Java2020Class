package day20ArrayCon;

import java.util.Arrays;

public class StringArrayMethods {
    public static void main(String[] args) {

        String str ="Batch 18";//each char are char, there is 8, array length going to be 8
        str.toCharArray(); //['B','a','t','c','h',' ','1','8'];

        String name ="Gozde Sultan Altug Peduk";

        char [] characters = name.toCharArray();

       System.out.println(Arrays.toString(characters));//[G, o, z, d, e,  , S, u, l, t, a, n,  , A, l, t, u, g,  , P, e, d, u, k]

        String str1 ="Cybertek School";
        String str2 ="School Cybertek";

        char [] ch1 = str1.toCharArray();



    }
}
