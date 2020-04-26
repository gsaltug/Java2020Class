package day16_forLoop;

public class Breakstatement {
    public static void main(String[] args) {

        for(int i =1; i<=5;i++){

            //break; //exits the loop, when you need to stop iteration especially.
            System.out.println("Hello World");//3 times and then checks the condition below.
            if(i==3){//it limits, compiler does not continue to run after 3.
           break; //executes top to bottom and prints 2 times, if I put if onto the sout, only 1 hello world will be printed since i==2 false.

       }

        }

        for(char i = 'a';i<='z';i++){
        System.out.println(i);

        if(i=='d'){//prints d// if I put it to top, exits before not printing d.
            break;
        }
    }
}}
