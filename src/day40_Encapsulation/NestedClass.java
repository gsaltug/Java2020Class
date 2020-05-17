package day40_Encapsulation;

public class NestedClass {
    static int a;

    //Class is another class, IF it is inner class, it can be static (declared as static)

 static class data{
        //share all the objects with main class
        //excepts only static members!!!
     static int b =200;
     static int c= 300;
     static{
         a=300;
     }
    }

    public static void main(String[] args) {
     //NestedClass.data
        System.out.println(NestedClass.data.class);
    }


}
