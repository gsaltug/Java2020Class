package day12_Javarecap;

import java.util.Scanner;

public class Nextline {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String str = input.next();
        System.out.println(str);
String fulladress =" ";
        System.out.println("Enter the number of the building: ");
        short number = input.nextShort();
fulladress += number + "";
        System.out.println("Enter street name:");
        String sname = input.next();
        fulladress +=sname;
        System.out.println("Enter route name:");
        String rname = input.next();
        fulladress+=rname;
        System.out.println(fulladress);
//==================================================

    }
}
