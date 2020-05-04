package day33_CustomClass;

import java.util.ArrayList;

public class Warmup_Chars {
    public static void main(String[] args) {
        String str = "ABCD1234$%45efg";
        char [] arr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> specialChars = new ArrayList<>();

        for(char each : arr){

            if( Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChars.add(each);
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChars);
    }


}
