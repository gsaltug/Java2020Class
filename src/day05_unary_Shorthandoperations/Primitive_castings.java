package day05_unary_Shorthandoperations;

public class Primitive_castings {

    public static void main(String[] args) {
        int a = 10;
        long b = a; //implicit casting done automatically, (long) a1
        //b= 10L

        System.out.println(b);

        //explicit casting

        int num1 = 100;
       // byte num2 = num1; converting larger to smaller byte = (byte) num1;

        short num3 = (byte) num1; //casting has to be same or smaller

        double num4 = 5.5;
        float num5 = (float) num4; //5.5
        float num6 = (int) num4; //5.0 ignore the decimal number

        double num7 = 10.5;
        long num8 = (int) num7;

        System.out.println(num8);

        System.out.println(num5 + 1);
        System.out.println(num6);

        float F1 = 60.5f;
        int F2 = (int) F1;
        System.out.println(F2);

        long Large = 9999999999l;
        int num9 = (int) Large;

        System.out.println(num9); //it gives different number because its out of int range.//1410065407.

        char c1 = 'a';
        short d1 = (short) c1;
        System.out.println(d1);

        char ch2 = 23456;
        double d6 = ch2;

        System.out.println(d6);
        System.out.println(ch2);

        int z1 = 10;
        double t1 = z1; //10.0 implicit casting is done automatically.
        short y1 = (short)z1;// expiliit, we have to assign it. //10

        System.out.println(y1);
        System.out.println(t1);










    }
}
