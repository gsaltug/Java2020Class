package day33_CustomClass;

import java.util.Scanner;

public class BankAcc2 {
    public static void main(String[] args) {
        BankAccount customer = new BankAccount();
        customer.Accountholder = "Lina";
        customer.Accountnumber = 918273645;
        customer.Balance = 0;
        Scanner sc = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("<1> for Deposit Money");
            System.out.println("<2> for Withdraw Money");
            System.out.println("<3> for Balance");
            System.out.println("<0> for Exit");
            int choice = sc.nextInt();
            if (choice == 0) {
                System.exit(0);
                //--------------------deposit --------------------
            } else if (choice ==1) {
                System.out.println("Enter the amount to deposit :");
                double cashin = sc.nextDouble();
                customer.deposit(cashin);
                customer.checkingBalance();
                System.out.println();
//-------------------------Withdraw---------------------------
            } else if (choice == 2) {
                System.out.println("Enter the amount to withdraw :");
                double cashout = sc.nextDouble();
                if (customer.Balance == 0 || customer.Balance < 0 ) {
                    System.out.println();
                    System.out.println( "You don't have any balance in your Account");
                    System.out.println();
                } else if ( customer.Balance > 0) {
                    customer.withdraw(cashout);
                    if (customer.Balance < 0 ) {
                        customer.Balance-= 35;
                        System.out.println("$ -35 added as a penalty charge to your balance");
                    }
                    customer.checkingBalance();
                    System.out.println();
                }
                //----------------Balance checking ------------------
            }else if (choice == 3) {
                System.out.println();
                customer.checkingBalance();
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Invalid Entry");
                System.out.println();
            }
        }
}}
