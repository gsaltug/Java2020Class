package day10_Switch_Scanner;

import java.util.Scanner;
//now you're allowed to use Scanner in this class.
public class ScannerClass {
    public static void main(String[] args) {
        /*
        declare scanner;
        Scanner variable name = new Scanner(System.in);
         */
        Scanner input = new Scanner(System.in);
        //after creating variableName will be reference to scanner object.Through variable name, we can call the methods of scanner.
        System.out.println("Enter a byte number");
        byte num1 = input.nextByte();
        System.out.println("You have entered: "+num1);//12 if I enter 12 in the console.
//find out if num1 is odd or even:

        if(num1 % 2==0){
            System.out.println(num1+ "is even number");
        }else{
            System.out.println("Odd number");
        }
    }

}
