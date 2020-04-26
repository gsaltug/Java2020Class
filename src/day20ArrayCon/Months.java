package day20ArrayCon;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        String[] months1= new String [12];
        months1 [0]="Jan";

        String months []= {"Jan", "Feb", "Mar", "April","May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};

        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();

int attempt =0;
        while(num>12||num<=0){
    System.out.println("Invalid number");
    System.out.println("Please re-enter the number:");
    num=input.nextInt();
    attempt++;

    if(attempt==3 && (num>12||num<=0)){
        System.out.println("Invalid entry");
        System.exit(0);
    }
}

        //String result ="";
String result = months[num-1];
      //  if(num==1){
       // result+=months[num-1];
       // }
        System.out.println(result);



    }


}
