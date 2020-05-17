package day36_StaticBlock;

//public class Tester{

//} Compile error!!!

class Developer1{
    public static void main(String[] args) {
        System.out.println("this is developer1 class");//this is developer1 class
    }

}

class ScrumT{
    public static void main(String[] args) {
        System.out.println("this is ScrumT class");

    }

}

public class MultiClass {
    //only one public class must be!!
    public static void main(String[] args) {
        System.out.println("public class");
    }

}

/*
You can have multiple classes in a same java file, as long as there is only one public class. Also the public class name must match with the file name.
 */