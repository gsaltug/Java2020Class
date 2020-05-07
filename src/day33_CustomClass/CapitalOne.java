package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount Gozde = new BankAccount();
        Gozde.Accountholder="Gozde";
        Gozde.Accountnumber=12345;

        Gozde.checkingBalance();
        Gozde.deposit(33);

        Gozde.withdraw(20);

        Gozde.checkingBalance();

        System.out.println(Gozde);

        //Account Holder: Gozde
        //Account Number: 12345
        //Avilable Balance: 13.0



    }


}
