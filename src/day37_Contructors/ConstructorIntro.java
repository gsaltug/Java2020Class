package day37_Contructors;

public class ConstructorIntro {

    //public method(){} constructor name must be same with class name
    public ConstructorIntro(int a){
        System.out.println("Constructor w parameter of int");
    }


    public static void main(String[] args) {
        ConstructorIntro obj = new ConstructorIntro(25);//object must be created w existin constructor
        ConstructorIntro obj2 = new ConstructorIntro(10);//two object constructor run 2 times
    }



}
