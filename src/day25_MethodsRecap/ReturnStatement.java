package day25_MethodsRecap;

public class ReturnStatement {
    public static void main(String[] args) {
        if(10>9){
return;
        }
        System.out.println("Hello");//not printed
        method1();

        System.out.println("Hello W");//will be printed
    }



    public static void method1() {
       if(11>10){
           return;
       }
        System.out.println("Hello");// will not be printed
    }

}
