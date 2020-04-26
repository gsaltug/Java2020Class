package day11_ScannerContinue;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name? ");
        String fname = input.next();
        System.out.println("What is your last name? ");
        String lname = input.next();

        String fullName = fname +" "+lname;

        System.out.println("Are you employeed? ");
        boolean employee =input.nextBoolean();
        double salary =0;
        if(employee==true){
            System.out.println("Enter your salary:");
            salary = input.nextDouble();
        }
        System.out.println("Full name is: "+fullName);
        System.out.println("Employeed: "+employee);
        System.out.println("Salary: "+salary);

    }
}
