package day06_Shorthnd_LogicalOperations;

public class Warmup {

    public static void main(String[] args) {

        double numofgallons = 1;
        double gallonstoliters = numofgallons*3.785;
        System.out.println(gallonstoliters);

        String result = numofgallons + " gallons equal to: "+ gallonstoliters + " liters ";

        System.out.println(result);

        double numofliters = 100;
        double literstogallons = numofliters / 3.785;

        String result2 = numofliters + " liters equal to: " + literstogallons + " gallons ";

        System.out.println(result2);

        //====================================================================================

        int a = 200;
        int b = -a++ + - --a * a-- %2;
        //b = -200 + -200 * 200 %2; //first *, %, and then +,-

        System.out.println(b); //-200
        System.out.println(a); //199

        //===================================================================================

        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
         //z = 300 + 400 -300 *400 + 300 /400 //first calculate division, *, +, -
             //= 300 + 400 - 120000 + 300/400         300/400=0.75 since int whole number the result is 0
              //= 700 - 120000 +0
        System.out.println(z); //-119300




    }
}
 /*
 warmup tasks

 1. Can you write a program to calculate liter to gallon?
 2. Can you write a program to calculate gallon to liter?
 3. the link is on muhtaronlychannel 3.17


  */