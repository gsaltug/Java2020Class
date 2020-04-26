package day17_WhileLoop;

public class PalindromeTest {
    public static void main(String[] args) {
        String str ="Level";
        String reversedStr="";

        int index =str.length()-1;

        while(index>=0){
            reversedStr+= str.charAt(index);
            index--;
        }
        //System.out.println(reversedStr);
    boolean palindrome =reversedStr.equalsIgnoreCase(str);

        System.out.println(palindrome);


    }
}
