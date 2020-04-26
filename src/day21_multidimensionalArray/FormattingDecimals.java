package day21_multidimensionalArray;

import java.text.DecimalFormat;

public class FormattingDecimals {
    public static void main(String[] args) {

        DecimalFormat DF =new DecimalFormat("0.00");//rounding decimals, always give String var.,and start with zero,

        double a =10.0/3.0;

        System.out.println(a);

        System.out.println(DF.format(a));//3.33 since there are two zeros on the dec.format above

        System.out.println(DF.format(2.3467895));//2.35
    }
}
