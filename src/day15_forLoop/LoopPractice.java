package day15_forLoop;

public class LoopPractice {
    public static void main(String[] args) {
        //print odd 1-100 in a single line, seperated by a space.
        String result = "";
        for (int num = 1; num <= 100; num += 2) {
            // System.out.print(num+" ");
            result += num + " ";
            System.out.println(result);
//even number

            String result2 = "";

            for (int number = 2; number <= 100; number += 2) {

                result2 = result2 + number + " ";
                System.out.println(result2);

            }


        }
    }
}