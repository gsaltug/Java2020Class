package day05_unary_Shorthandoperations;

public class Unary_operators {

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = -n1; //-10
        boolean b1 = n2 > 10; //false
        boolean b2 = n2 < 0; //true

        int x1 = -10;
        int y1 = x1; //10

        int d = 20;
        int e = - d; //-20
        System.out.println(y1);
        System.out.println(n2);
        System.out.println(b1);
        System.out.println(b2);

        //++ increment: increase the value by 1 ; -- decrement: decrease the value of the variable by 1.
        //post: not immediately, pre: immediately (put before the v.)

        int z = 100;
        System.out.println( ++ z); //101
        System.out.println(z); //101 immediately

        int P = 100;
        System.out.println( P++ ); //100 FIRST pass the current value
        System.out.println(P); //print 101 now.

        int B = 100;
        System.out.println(B--); //100
        System.out.println(B); //99








    }
}
