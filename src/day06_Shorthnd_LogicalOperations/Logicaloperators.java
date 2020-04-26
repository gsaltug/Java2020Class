package day06_Shorthnd_LogicalOperations;

public class Logicaloperators {
    public static void main(String[] args) {
        boolean x = !true; //gives opposite
        System.out.println(x);

        boolean result2 = !(10 + 15 > 15); //false
        System.out.println(result2);

        boolean result3 = !true == !false;
        System.out.println(result3); //true is not equal to false ==>false

        //&& and logic

        boolean y = 10 > 12 && 10 < 11;
        System.out.println(y); //false

        boolean f = 10 != 12 && 10 != 11;
        System.out.println(f); //true, the only comdition, both of the conditions are true, otherwise false.

    }
}
