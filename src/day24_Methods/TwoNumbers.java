package day24_Methods;

import java.util.Scanner;

public class TwoNumbers {
    public static void Max(int num1, int num2){
        //Scanner scan =new Scanner (System.in); do not use scanner
       // System.out.println("Enter first number");
       // int num1 = scan.nextInt();
       // System.out.println("Enter second number");
       // int num2 = scan.nextInt();

        if(num1>=num2){
            System.out.println("Maximum number is :"+ num1);
        }else{
            System.out.println("Max number is: "+num2);
        }
    }

    public static void Calculation (double num1, double num2, char operator){
        switch (operator){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
        }
    }

    public static void palindrome (String str){
        str =str.toLowerCase();
        String reversed ="";
        for(int i =str.length()-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        System.out.println(str.equals(reversed));
    }

    public static void main(String[] args) {
        int a =10;
        int b= 20;

        Max(a,b);

        palindrome("Anna");

while (true){

    Scanner scan = new Scanner(System.in);
    System.out.println("Num1");
    int num1 = scan.nextInt();
    System.out.println("Num2");
    int num2 = scan.nextInt();
    System.out.println("Operator");
    char operator = scan.next().charAt(0);

    Calculation(num1, num2, operator);
    System.out.println("Do you want to continue?");
    String answer =scan.next();

    while(!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
        System.out.println("invalid entry, please re-enter");
        System.out.println("Do you want to continue?");
        answer=scan.next();
    }
    if(answer.equalsIgnoreCase("No")){
        break;
    }
}


    }

}
