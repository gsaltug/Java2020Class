package day02_variables;

public class Variables {

    public static void main(String[] args) {
        /*
        declare variables
        Datatype Variable name = Data;
         */
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        //byte nub2 = 2.5 byte, short, int, long they only accept whole numbers
        //byte nub1 = 130 it exceeds the range.

        short num = 1000;
        // short num2 = 40000; exceeds the range of short.
        System.out.println(num);

        System.out.println( 12345);//by default compiler takes it as int primitive

        int num1 = 20000;
        System.out.println(num1);

        //long num3 = 99999999; //out of int range, compiler by default accept int

        long num3 =999999999l; //forcefully tells the complier that is long number either give lower or upper case l
        //since its not number its not gonna print l
        System.out.println(num3);
        System.out.println( 999999999999L);
//double > float > long > ing > byte
        short s1 = 10;
        //byte b1 = s1 byte is smaller than short

        int i1 = s1;
       //byte b1 = s1; //larger one cannot be assigned to smaller one

        System.out.println( 3.5 );
        double d1 = 3.5;
        float f1 = 4.5f;
        System.out.println(f1);
        //double primitive is larger than float so put f/F

        float p1 = 3.14f;
        System.out.println(p1);
        double d2 = 3.14;
        System.out.println(d2);

        //int can be assigned to double
        int a1 = 3000;
        double d4 = a1;
        System.out.println(d4);

        long l2 = 40;
        float f4 = l2;

        System.out.println(f4);


    }
}
