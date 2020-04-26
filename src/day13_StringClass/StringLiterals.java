package day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "Cat";//String Pool
        String str2 = new String ( "Cat");//Heap
        System.out.println(str1==str2);//false since everytime you created new it will be different object, two different memory, even the visible is same.
        String str3 = "Cat";//String pool
//One object in the string pool as "Cat" and shared by 3 String literal.

        System.out.println(str1==str3);//true
String str4 = new String ("Cat");
        System.out.println(str2==str4);//false, those two are independent object, each time creates new memory.


        /*
        String: is IMMUTABLE, once the object is created it cannot change.
         but you can reassign the value.
         String s = "Java";//it will stay in the string pool,
         s="JavaScript";//then new object will be created in the string pool.

         */

        String s1 = "Java";
        s1= "JavaScript"; //I have reassigned value "JavaScript.

        System.out.println(s1);

        String s2 ="Java";//no new object will be created in the memory, it will be shared by s1.
        System.out.println(s1==s2);//false; JavaScript!=Java

//3.String represents the sequence of characters.
//each cha.has index number, index number starts from zero, can not be less than zero.

String str = "Cybertek";
//index       01234567...
        String str5 = "Cat dog";
        //index        0134567, even space is char. and has index number.
//String manipulations

    }

}
