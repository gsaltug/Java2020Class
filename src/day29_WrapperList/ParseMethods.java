package day29_WrapperList;

public class ParseMethods {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);  //123

        System.out.println(str + 1); // text
        //        "123" + 1   ==> "1231"

        System.out.println(a1+1);  // number
        //         123 + 1 ==> 124


        byte b1 =  Byte.parseByte(str);    // byte = 123

        System.out.println( b1 + 5 );

        Integer I1 =  (int)Byte.parseByte(str);  // AutoBoxing

        // Integer  = (int)byte;
        // Integer = int;

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);

        System.out.println(num1+1);

       long num2= Long.parseLong(str3);
        System.out.println(num2+2);

        String result1 = "true";//false
        boolean r1 =Boolean.parseBoolean(result1);

        System.out.println(r1);

        String result2 = "I love java";//false
        boolean r2 =Boolean.parseBoolean(result2);

        System.out.println(r2);
    }
}
