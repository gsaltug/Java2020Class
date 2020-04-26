package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a=10;
        int b=2;

        if(b==0){
            System.out.println("b can not be 0");
            System.exit(0);
        }

        int count =0;//count the execution of the loop.

        while (a>=b){
            a-=b;
            count++;
        }
        if( a==0){
            System.out.println("The result is"+count);
        }else {
            System.out.println("The result is"+count+"with the reminder of"+a);
        }


        //System.out.println(count);
        //System.out.println(a);
    }
}
/* write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators*/