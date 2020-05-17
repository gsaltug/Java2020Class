package day39_AccessModifiers;

public class Test {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();

        System.out.println( obj.defaultaccess);
        System.out.println(obj.publicAccess);
       // System.out.println(obj.SSN); not accessible from outside the package and class


    }
}
