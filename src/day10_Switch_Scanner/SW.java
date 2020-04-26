package day10_Switch_Scanner;

public class SW {
    public static void main(String[] args) { //nothing is mandatory in the switch statement. In the case block you can give if statement.
    byte a=4;//expression must be single value, character, expression, or number.
     float b = 4.5f; //float, long, double, boolean not accepted.

        switch(a){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}
