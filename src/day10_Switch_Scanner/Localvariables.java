package day10_Switch_Scanner;

public class Localvariables {
    public static void main(String[] args) {
        int a =100;
        //that are declared within a block. Must be initilazed before we use them.
        if(true){
            System.out.println(a);
            int b=200;
        }
       // System.out.println(b); local variable can not be used outside of the block.
        switch(3){
            case 1:
                int c =100;
            case 2:
           //     System.out.println(c); c belongs to case 1 block. Thus, you can not use this variable outside of the this block.
        }
        if(9>10){
            int t=100;
        }else if (11>10){
            int y =200;
        }else if (12>10){
            int z = 300;//in this block z is defined, I can change to t. When I run it it is gonna give me error, since local variables can not be used outside of the block.
        }
    }
}
