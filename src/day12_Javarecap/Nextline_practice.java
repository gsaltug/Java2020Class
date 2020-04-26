package day12_Javarecap;

import java.util.Scanner;

public class Nextline_practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Enter

        System.out.println("Enter your name:");//nxtLine accept enter, takes everything that scanner has.
        String name = scan.nextLine();
        System.out.println(name);

        scan.nextLine(); //get rid of this enter

        System.out.println("Enter a number:");
        int num = scan.nextInt();
        System.out.println(num);




    }
}
