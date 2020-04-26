package day14_StringClass;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter your fullname");
        String fullname = input.nextLine();

        String firstname = fullname.substring(0,fullname.indexOf(" "));
        firstname= firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
        String lastname = fullname.substring(fullname.indexOf(" ")+1);
        lastname= lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();

        System.out.println(firstname+lastname);

        System.out.println("Enter your firstname");
        String firstname2 = input.nextLine();

        firstname2 = firstname2.substring(0,1).toUpperCase();

        System.out.println("Enter your last name");
        String lastname2 = input.nextLine();

        lastname2 = lastname2.substring(0,1).toUpperCase();

        System.out.println(firstname2+lastname2);



    }
}
