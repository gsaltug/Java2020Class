package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3 (){

        this(5);
        System.out.println("Default Cons");


    }

    public ConstructorCalls3(int a){
    //    this(); error in the def.cons we hace cons with int arg. already contained, so can not contain itself. if I comment line 7, it will be fixed
        System.out.println("int arg");
    }

    public ConstructorCalls3(String str){
        this(5); //constructor can not call itself in the body
    }
    public void method(){
     //   this(); error
    }

    public static void main(String[] args) {
        ConstructorCalls3 obj = new ConstructorCalls3();
        //int arg
        //Default Cons
    }
}
