package Resources;
import day39_AccessModifiers.AccessModifiers;// now we are able to use this
public class AccessModifier_Test {

    //default is accessible outside the class
    //you have to import
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.publicAccess);//default gives compile error, always visible at anywhere.


    }



}
