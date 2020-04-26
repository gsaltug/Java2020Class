package day24_Methods;

import java.util.Arrays;
import Resources.Library;
public class Test {
    public static void main(String[] args) {
        String str ="Cybertek";

      String RevStr =  Library.Reverse2(str);
        System.out.println(RevStr);//ketrebyC
        System.out.println(str.equalsIgnoreCase(RevStr));//false not palindrome

        int [] arr = { 2000, 3100, 24000, 2510};

      //  int des [] = Library.sortDesending(arr);
 arr = Library.sortDesending(arr);
 Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[2000, 2510, 3100, 24000]

    }



}
