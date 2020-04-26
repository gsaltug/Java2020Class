package day24_Methods;

import java.util.Scanner;

public class BirthYear {

    public static void Age (short birthyear) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year");
        int currentYear = scan.nextInt();
        int age = currentYear - birthyear;
        if (age>0 && birthyear>1900) {
            System.out.println(age);

        } else {
            System.out.println("Invalid entry");
        }

    }
    public static void main(String[] args) {
        int a = 2030;
        Age((short) a);//18
    printHelloCybertek();
    }
public static void printHello(){
    System.out.println("Hello");
}
public static void printCybertek(){
    System.out.println("Cybertek");
}
public static void printHelloCybertek(){
        printHello();
        printCybertek();
}
}
