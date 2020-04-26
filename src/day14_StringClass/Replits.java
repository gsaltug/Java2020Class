package day14_StringClass;

import java.util.Scanner;

public class Replits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //WRITE YOUR CODE HERE

        //WRITE YOUR CODE HERE
        String in = s.next();

        //your code here
        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.nextLine();
        boolean result1 = answer.equals("a")||answer.equals("c");
        boolean result2 = answer.equals("b");
        boolean result3 = answer.equals("z");

        if(result1){
            System.out.println("wrong");

        }else if(result2){
            System.out.println("correct");
        }else{
            System.out.println("not a valid answer");
        }








    }
}
