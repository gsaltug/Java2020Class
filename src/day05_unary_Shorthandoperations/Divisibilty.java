package day05_unary_Shorthandoperations;

public class Divisibilty {
    public static void main(String[] args) {
        int number = 65;
        boolean dividedby2 = number % 2 == 0; //if the number can be divisible by 2
        boolean dividedby3 = number % 3 == 0;
        boolean dividedby5 = number % 5 == 0;

        String result1 = number+ " " + "is divisible by 2: "+ dividedby2;
        String result2 = number+ " " + "is divisible by 3: "+ dividedby3;
        String result3 = number+ " " + "is divisible by 5: "+ dividedby5;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

                System.out.println(result1 + "\n" + result2 +"\n"+ result3);

        String finalresult = result1 + "\n" + result2 +"\n"+ result3;

        System.out.println(number+ " " + "is divisible by 2: "+ dividedby2);
        System.out.println(number+ " " + "is divisible by 3: "+ dividedby3);
        System.out.println(number+ " " + "is divisible by 5: "+ dividedby5);

        System.out.println(finalresult);
    }
}
