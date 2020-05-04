package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
//Interview Question!!!
public class ExtraChars3 {
    public static void main(String[] args) {
        String str = "ABCD1234$%45efg";
        char [] arr = str.toCharArray();

        Character[] ch = new Character[arr.length];
        for(int i=0; i< arr.length; i++){
            ch[i]=arr[i];
        }

        System.out.println(Arrays.toString(ch));//[A, B, C, D, 1, 2, 3, 4, $, %, 4, 5, e, f, g]

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);//[A, B, C, D, e, f, g]

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(p-> !Character.isDigit(p));
        System.out.println(digits);//[1, 2, 3, 4, 4, 5]

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));

        specialChars.removeAll(letters);
        specialChars.removeAll(digits);
        System.out.println(specialChars);//[$, %]

    }

}
