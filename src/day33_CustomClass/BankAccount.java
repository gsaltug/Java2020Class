package day33_CustomClass;

public class BankAccount {
    /*
    create a custom class for BankAccount
	attributes/data that can have are:
					1. AccountHolder, 2. AccountNumber, 3. Balance
		Actions: showBalance, deposit, withdraw
		requiremnts:
			1. user should be able to deposit money into their account
			2. user should be able to withdraw money from their account
					2.1 if the withdrawing account is greater than available balance, 35$ penalty charge will be added
					2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
			3. user should be able to see their balance

     */

    String Accountholder;
    int Accountnumber;
    double Balance;

    public void checkingBalance(){
        System.out.println("Available balance is "+Balance);
    }

    public void withdraw (double amount){
        System.out.println("Withdrawing $ "+amount);
        Balance -=amount;
    }

    public void deposit (double amount){
        System.out.println("Depositing $ "+amount);
        Balance += amount;
    }

    public String toString(){
        String result = "Account Holder: "+Accountholder+"\nAccount Number: "+Accountnumber+"\nAvilable Balance: "+Balance;
        return result;
    }

}
