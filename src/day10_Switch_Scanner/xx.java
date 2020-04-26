package day10_Switch_Scanner;
import java.util.Scanner;
public class xx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numofcoupons = input.nextInt();

        int numberofcandies = (numofcoupons) / 10;
        int numofgums = (numofcoupons%10)/3;

        if (numofcoupons<3){
            System.out.println("Not enough coupons");

        }else {
            System.out.println("Number of candies: "+numberofcandies);
            System.out.println("Number of gums: " +numofgums);
        }

    }
}




