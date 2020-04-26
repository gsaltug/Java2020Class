package day06_Shorthnd_LogicalOperations;

public class Shorthandoperations {
    public static void main(String[] args) {
        int x = 20;
        x += 10; //x = x + 10

        x += 60; //x = 90 now

        System.out.println(x); //it gives addition assignment.

        String schoolname = "Cybertek";
        schoolname += 12345;
        System.out.println(schoolname); //Cybertek12345
        System.out.println('a'+'b'); //97+98 = 195

        char ch1 = 'a';
        ch1 += 'b';
        System.out.println(ch1); //return me character data type decides, char takes single character

        int num = 'z';
        num += 'x';
        System.out.println(num); //242 because it is whole number

        //==============================================================================================

        //Subtraction assignment

        int z = 100;
        z -= 90;
        System.out.println(z); //10

        int r = 200;
        r -= z;

        System.out.println(r); //190

        //============================================================================================
        //reminder

        int num1 = 300;
        num1 %= 10 + 20; //num%=30;
        //num1 ==>300%30=0
        System.out.println(num1);





    }
}
