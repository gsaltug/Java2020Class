package day26_MethodOverloading;

import java.util.Arrays;

public class Replits {
    public static String limit(String text, int maxLength)
    {
        if (text.length() > maxLength) {
            text = text.substring(0, maxLength);
        }
        return text;
    }

    public static String at3(String target,String word)
    {


        String word2 = target.substring(0,2).concat(word).substring(2, target.lastIndexOf(target));
        return word2;
    }

    public static void main(String[] args) {
        String target = "gozde";
        String word ="emrah";
        String word2 = target.substring(0,3).concat(word)+target.substring(3, target.length());
        System.out.println(word2);

    }
    public static String reverse(String input)
    {
        String Reverse =" ";

        for (int i= input.length()-1;i>=0; i--){
            Reverse +=input.charAt(i);

        }
        return Reverse;
    }
}

