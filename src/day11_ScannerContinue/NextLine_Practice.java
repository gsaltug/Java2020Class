package day11_ScannerContinue;

import java.util.Scanner;

public class NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("What is your age? ");
        int age = input.nextInt();
        System.out.println("Your age is: "+age);

        input.nextLine();//It take out the enter.

        System.out.println("What is your name? ");
        String fullname = input.nextLine();
        System.out.println("Your full name is: "+fullname);
    }
}
