package day19_LoopArray;

import java.util.Scanner;

public class ArrayPrac3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String [] snames = new String [4];
snames[0]="john";
snames[1]="kaylie";
snames[2]="britney";
snames[3]="Lina";
        System.out.println("Please enter a number");
        int num = input.nextInt();

        int attempt =0;
        while(num>4 || num<=0){
            System.out.println("Invalid entry, please try again");
            System.out.println("Enter a number");
            num=input.nextInt();
            attempt++;

        if(attempt>2 && (num>4 || num<=0)){
            System.out.println("Invalid entry");
            System.exit(0);
        }



        }

        String result =snames[num-1];
        System.out.println(result);
        //store the students name in the array.
    }
}
