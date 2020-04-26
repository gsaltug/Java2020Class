package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        /*
        validcredentials are;
        username:cybertek
        password:cybertekschool

        precondition username and password can not be empty.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your user name:");
        String username = input.nextLine();

        System.out.println("Enter your password");
        String password = input.nextLine();

        boolean login = username.equals("cybertek")&&password.equals("cybertekschool");
        boolean invalidusername = !username.equals("cybertek") && password.equals("cybertekschool");
        boolean invalidpassword = username.equals("cybertek") && !password.equals("cybertekschool");

        if (!username.isEmpty() && !password.isEmpty()) {
            if(login){
                System.out.println("logged in");
            }else if(invalidusername){
                System.out.println("Invalid username");
            }else if(invalidpassword){
                System.out.println("Invalid password");
            }else{
                System.out.println("Invalid username and password");
            }

        }else{
            System.out.println("please enter the credentials");
        }
    }
}
