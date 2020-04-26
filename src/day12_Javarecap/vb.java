package day12_Javarecap;

import java.util.Scanner;

public class vb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count, and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        String sum="";
        double totalprice =0;


        if (count1>0 ) {
            sum += "Item1: "+item1+" Price: "+price1*count1+", ";
            totalprice += price1*count1;
        }
        if (count2>0 ) {
            sum += "Item2: "+item2+" Price: "+price2*count2+",";
            totalprice += price2*count2;
        }
        if (count3>0 ) {
            sum += "Item3: "+item3+" Price: "+price3*count3;
            totalprice += price3*count3;
        }else{

        }
        System.out.println(sum);
        System.out.println("Total price: "+totalprice);




    }
}
