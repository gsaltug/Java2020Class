package day29_WrapperList;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str ="123";

        Integer a = Integer.valueOf(str);

        System.out.println(a+1);//124
        double b = Integer.valueOf(str);
        System.out.println(b);//123.0
        //double =Integer-->
        // unboxing

        String str2 = "15.5";
        double d = Double.parseDouble(str2);
        //double =double //none boxing
        System.out.println(d);//15.5

        double d2 = Double.valueOf(str2);
        // double= Double //unboxing
        System.out.println(d2);//15.5

        System.out.println(d==d2);//true

        System.out.println("======================");
        int z =2000;
        Long L1= Long.valueOf(z); //Long L1=z; does not accept any other primitives except long

        Short sh1 = 3000;
        int z2 = sh1;

        String r1 ="true";
        Boolean t1 =Boolean.valueOf(r1);

        System.out.println(t1);

        boolean t2 = Boolean.valueOf(r1);
        System.out.println(t2);

        int maxnum = Integer.MAX_VALUE;
        System.out.println(maxnum);

        double max2 = Integer.MAX_VALUE;
        System.out.println(max2);

        int min = Integer.MIN_VALUE;
        System.out.println(min);

        byte max = Byte.MAX_VALUE;//127
        System.out.println(max);

        byte mi1n = Byte.MIN_VALUE;
        System.out.println(mi1n);//-128

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};


    }


}
