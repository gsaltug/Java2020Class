package day11_ScannerContinue;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name: ");
       // String fullname = input.next();
         String fullname = input.nextLine(); //enter is accepted.
        System.out.println("Your full name is: "+ fullname); //gozde. first word only

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();

        System.out.println("You have entered: "+sentence);
    }

}
