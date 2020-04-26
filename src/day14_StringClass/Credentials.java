package day14_StringClass;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*
        username:Cybertek
password:Cybertekschool, write a program if the password is correct or wrong.

         */

        String validusername = "cybertek";
        String validpassword = "cybertekschool";

        System.out.println("Enter your user name:");
        String username = input.next();

        System.out.println("Enter your password");
        String password = input.next();

        boolean validcredentials = validusername.equals(username) && validpassword.equals(password);
     /*
        if (validusername.equals(username) && validpassword.equals(password)){
            System.out.println("Logged in successfully");
        }else{
            System.out.println("Invalid credentials");
        }

      */

        if (validcredentials) {
            System.out.println("Logged in successfully");
        } else if ((validusername != username) && (validpassword ==password)) {
            System.out.println("Invalid username");
        } else if ((validpassword != password) && (validusername == username)) {
            System.out.println("Invalid password");
        } else {
            System.out.println("Invalid username and password");
        }



    }
}
