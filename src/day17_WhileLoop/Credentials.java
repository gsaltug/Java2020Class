package day17_WhileLoop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter user name:");
        String username= input.next();

        System.out.println("Enter password:");
        String password =input.next();

        while(!username.equals("cybertek")&&!password.equals("cybertek123")){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter user name:");
            username= input.next();

            System.out.println("Enter password:");
            password =input.next();
        }
        System.out.println("Logged in");



    }
}
