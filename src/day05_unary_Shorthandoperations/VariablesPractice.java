package day05_unary_Shorthandoperations;

public class VariablesPractice {
    public static void main(String[] args) {

        int a = 100;
        float f1 = (long)a; //100.0

        long l1 = (long)f1;
        System.out.println(l1);
        System.out.println(f1);

        //Those variables are "local variables" since they are declared in the main method.You need to initialize it before you use.
        String name;
        name = "Cybertek"; //in java first come first serve.
        System.out.println(name);// before line 15 it has to be initialized, otherwise will always give compile error.
    }
}
