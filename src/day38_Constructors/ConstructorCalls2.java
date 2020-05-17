package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2 (){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        this();//default cons.
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
        this(10);
        //this(); error, one constructor can only call one constructor.
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("18");
    /*
    Default constructor
Constructor with int argument
Constructor with String argument
     */

    }
}
