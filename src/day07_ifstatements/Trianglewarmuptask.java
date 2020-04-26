package day07_ifstatements;

public class Trianglewarmuptask {
    public static void main(String[] args) {

         short angle1 = 30;
         short angle2 = 50;
         short angle3 = 60;

         int sumoftriangles = angle1 + angle2 + angle3;
         boolean validtriangle = (sumoftriangles) == 180;

         if(validtriangle){
             System.out.println(" the shape is triangle ");
                    }
         if (!validtriangle){
             System.out.println(" the shape is not triangle ");
         }


        /*
        A triangle is valid if the sum of all three angles is equal to 180 degrees. Write a program that declares three integers as angles and check whether a triange is valid or not.

         */
    }
}
