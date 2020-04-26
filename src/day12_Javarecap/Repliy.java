package day12_Javarecap;

import java.util.Scanner;

public class Repliy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String fname = scan.next();

        System.out.println("Enter your last name");
        String lname = scan.next();

        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contact = "work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+", email: "+email;
        String fullname = fname+", "+lname;
        String address = street+", "+city+", "+state+" "+zipcode;
        System.out.println("Patient personal information"+"\nFull name: "+fullname+"\nAddress: "+address+"\nContacts: "+contact+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds \nMarried?: "+isMarried);



        /*
        -build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true


         */



    }
}