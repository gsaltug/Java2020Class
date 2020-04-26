package day06_Shorthnd_LogicalOperations;

public class Singleifstatement {
    public static void main(String[] args) {
        //it means conditions, if the boolean expression we give is true.
         boolean coldweather = true;

         if(coldweather){ //since the boolean exp. is true I print statement on the console in if statement body.
             //codes only get executed if the condition is true.
             System.out.println("Wear your hat");
             System.out.println("Wear your jacket");
         }

         boolean crnadetected = true; //its not executed w/false. First check the condition, and if its true print the console.

         if(crnadetected){
             System.out.println("buy more supply");
             System.out.println("stay at home"); //there is no chance to execute them seperately in the if body.
             System.out.println("do more exercise");
         }

         //=================================================================================================
        //write a program if the number is even number
        int a = 101; //if the number is not qualify, it does not print since gives me false, never executed.
         boolean evennumber = a % 2 == 0;

         if(evennumber){
            System.out.println(a + " is even number ");
        }

         int b = 101;
         boolean oddnumber = b % 2 != 0;

         if(oddnumber){
             System.out.println(b + " is odd number "); //101 is odd number.
         }
    }
}
