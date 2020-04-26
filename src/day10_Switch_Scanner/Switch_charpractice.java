package day10_Switch_Scanner;

public class Switch_charpractice {
    public static void main(String[] args) {
        char num = 'A';

        switch(num){
            case 'A':
                System.out.println("A");

            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
            default:
                System.out.println("Not Found");
                break;


        }
    }
}
