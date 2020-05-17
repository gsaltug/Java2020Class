package day36_StaticBlock;

public class StaticBlock {

    static{
        System.out.println("Static method executed");//executed first does not matter the order
    }

    public static void main(String[] args) {
        System.out.println("main method executed");
        method();
    }

    public static void method(){
        System.out.println("Custom method executed");
    }

}
/*
Static method executed first runs, only runs 1 time
main method executed
Custom method executed
 */