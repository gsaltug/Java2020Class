package day38_Constructors;

public class ConstructorPractice {

    public ConstructorPractice(){
        this(0.2);//rule 3
        System.out.println("A");
    }

    public ConstructorPractice(int a){
        this(); //C A B
        System.out.println("B");
    }

    public ConstructorPractice(double a){
  //     this(2.5); I can not call since already called in line6 rule 5
        System.out.println("C");
    }

    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice();//C A
    }
}
