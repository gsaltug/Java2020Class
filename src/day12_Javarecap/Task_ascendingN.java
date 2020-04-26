package day12_Javarecap;

import java.util.Scanner;

public class Task_ascendingN {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter five numbers: ");

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int fourthNum = input.nextInt();


        int firstPlace = 0; int secondPlace =0; int thirdPlace =0; int fourthPlace = 0; int fifthPlace = 0;

        if (firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum) {
            firstPlace = firstNum;
        } else if (secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum) {
            firstPlace = secondNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum) {
            firstPlace = thirdNum;
        } else if (fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum) {
            firstPlace = fourthNum;
        }
        //firstPlace end

        //fourthPlace start
        if (firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum) {
            fourthPlace = firstNum;
        } else if (secondNum < firstNum && secondNum < thirdNum && secondNum < fourthNum) {
            fourthPlace = secondNum;
        } else if (thirdNum < firstNum && thirdNum < secondNum && thirdNum < fourthNum) {
            fourthPlace = thirdNum;
        } else if (fourthNum < firstNum && fourthNum < secondNum && fourthNum < thirdNum) {
            fourthPlace = fourthNum;
        }
        //forthPlace end

        //secondPlace start
        if (firstNum != firstPlace && firstNum != fourthPlace && firstNum < firstPlace && firstNum > fourthPlace && firstNum > fourthNum) {
            secondPlace = firstNum;
        } else if (secondNum != firstPlace && secondNum != fourthPlace && secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum) {
            secondPlace = secondNum;
        } else if (thirdNum != firstPlace && thirdNum != fourthPlace && thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum) {
            secondPlace = thirdNum;
        } else if (fourthNum != firstPlace && fourthNum != fourthPlace && fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum) {
            secondPlace = fourthNum;
        }
        //secondPlace end

        //thirdPlace start
        if (firstNum != firstPlace && firstNum != secondPlace && firstNum != fourthPlace) {
            thirdPlace = firstNum;
        } else if (secondNum != firstPlace && secondNum != secondPlace && secondNum != fourthPlace) {
            thirdPlace = secondNum;
        } else if (thirdNum != firstPlace && thirdNum != secondPlace && thirdNum != fourthPlace) {
            thirdPlace = thirdNum;
        } else if (fourthNum != firstPlace && fourthNum != secondPlace && fourthNum != fourthPlace){
            thirdPlace = fourthNum;
        }
        //thirdPlace end

        System.out.println("The sorted numbers are: "+ firstPlace + " " + secondPlace + " " + thirdPlace + " " + fourthPlace);
        }

    }

/*
//TASK: Write a program that asks to enter 5 numbers and prints in ascending order.
 */