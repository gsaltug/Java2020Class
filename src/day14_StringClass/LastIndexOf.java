package day14_StringClass;

import java.util.Scanner;

public class LastIndexOf {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = "I like Java. I like to watch TV";

       int i = str.lastIndexOf("I");
        System.out.println(i);//13

        int x = str.lastIndexOf("I like");//13, gives first index
        System.out.println(x);

       boolean x1 = str.isEmpty();
        System.out.println(x1);
//===================================================
        System.out.println("enter");
        String word = s.next();






    }
}
