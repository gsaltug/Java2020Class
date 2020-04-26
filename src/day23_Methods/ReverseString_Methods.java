package day23_Methods;

public class ReverseString_Methods {
    //Create a function that can reverse any string.
    public static void main(String[] args) {
        String names ="Gozde";
        ReverseString(names); //edzog

        String name2 ="Lina";
        ReverseString(name2);

        String name3 ="Emrah";
        ReverseString(names);
    }
    public static void ReverseString(String word){
        for(int i= word.length()-1; i>=0 ;i--){
            System.out.println(word.charAt(i));

        }


    }
}
