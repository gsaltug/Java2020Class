package day09_nestifTernary;

public class IfstatementWithoutCurlyBraces {
    public static void main(String[] args) {
        int number =100;

        if (number % 2 == 0)
            System.out.println("Even number"); //if there is only one statement in the if block, you can delete curly braces.
        else
            System.out.println("Odd number");

        if(9<8){
            System.out.println("Hello Cybertek");//there are two statement, so it is not gonna print that.
            System.out.println("Welcome");
        }
    }
}
