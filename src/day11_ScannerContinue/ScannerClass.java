package day11_ScannerContinue;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Long Primitive
        System.out.println("Enter a long number");
        long number = input.nextLong();
        System.out.println("You have entered: "+number);

        //==================
        // Float Primitive
        System.out.println("Enter a decimal: ");
        long b = (long) input.nextFloat(); //Casted long.
        System.out.println("You have entered: "+b);

        //Double Primitive
        System.out.println("Enter decimal number:");
        double c = input.nextDouble();

        System.out.println("You have entered: "+c);
        //boolean

        System.out.println("Enter true or false:");
        boolean d = input.nextBoolean();
        System.out.println("You have entered:"+d);

        //next() : Return input single word, but only first word as String
        System.out.println("Enter your sentence: ");
        String word = input.next();
        System.out.println("Your have entered: "+word);
    }
}
