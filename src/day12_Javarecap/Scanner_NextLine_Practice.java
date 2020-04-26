package day12_Javarecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//

        //6405 Dixon Dr, Raleigh NC, 27609
        //fullAddress : Building-number Street, city, state, zip code
        System.out.println("Enter the building number: ");
        int Bnumber = input.nextInt();//6405enter
        System.out.println("Building number is: "+  Bnumber);
        input.nextLine();
        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: "+street);
        System.out.println("Enter zip code: ");
        int zipcode = input.nextInt();
        System.out.println("Zip code is: "+zipcode);
        input.nextLine();
        System.out.println("enter the city name and state seperated by coma and space");
        String CityState = input.nextLine();
        String fulladdress = Bnumber+" "+street+", \n"+CityState+" "+zipcode;
        System.out.println(fulladdress);

        input.close();
//Whenever you are done with the Scanner, use close method to close the scanner, not mandatory, but recommended, performance is gonna be faster.


    }
}
