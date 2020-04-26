package day14_StringClass;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "Cybertek";
        System.out.println(str.charAt(1));

        System.out.println(str.length()-1);

        int totallenght = str.length()-2;
        System.out.println(totallenght);

        int maxindexnum = str.length()-1;

        String s1 = "  Cybertek";
       s1 = s1.concat(" School");

        System.out.println(s1);

        s1 =s1.toLowerCase();
        System.out.println(s1);

        s1=s1.toUpperCase();
        System.out.println(s1);

        s1 =s1.trim();
        System.out.println(s1);
//substring cut the sentence, you give beginning index and ending index.

        String str2 = "Cybertek School is the best";
        String schoolname = str.substring(0,8);
        System.out.println(schoolname);
        System.out.println(str2);

        String s6 = "I love Java";
        System.out.println(s6.substring(2));

       s6= s6.replace("Java", "C#");
        System.out.println(s6);

        //indexOf, returns the index number of the first occured char. as int.

        String s7 = "I like java programming";

        int j= s7.indexOf("j");
        System.out.println(j);

        int maxindex = s7.length()-1;
        System.out.println(maxindex);

        String fullname = "Kuzzat Altay";
        String firstname = fullname.substring(0, fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" "));
        System.out.println(firstname+lastname);


    }
}
