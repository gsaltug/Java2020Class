package day38_Constructors;

public class ConstructorCalls {

    public ConstructorCalls(){
        method1();
        method2();
    }

    public ConstructorCalls(int a){
    //    ConstructorCalls(); still error
    this();//calls default constructor

    }
    public static void method1(){//static method
     method1();
 //    method2(); error
    }

    public void method2(){}//instance method
 //   ConstructorCalls(); error
 //   method1();error
}
