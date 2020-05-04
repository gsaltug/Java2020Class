package day26_MethodOverloading;

public class MethodOverloading {
    //multiple methods sharing the same name, but parameters must be different.
//either data type or number of the parameters
    public static void main(String[] args) {
        method(10);//prints org w/int one
        method1(10.0);//prints org w/double one
    }

    public static void method(int str){//1 parameter
        System.out.println("Original method");

    }
    public static void method(int str, int b){//2 parameter
        System.out.println("Overloaded method");

    }
    public static void method1(double str){//1 data type is different
        System.out.println("Original method");

    }
    public static void method1(int str){
        System.out.println("Overloaded method");

    }
}
