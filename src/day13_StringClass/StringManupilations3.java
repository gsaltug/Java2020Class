package day13_StringClass;

public class StringManupilations3 {
    public static void main(String[] args) {
        //indexOf, identifies the index number of a specific character as int.

        String str = "I like java programming john";

        int num1= str.indexOf("j"); //it returns the very first j's number, not return another j's number.
//7
        System.out.println(num1);

        int num2 = str.indexOf("john");
        System.out.println(num2);//24

        String str2 ="Cybertek School is awesome";

        int num3 = str2.indexOf("S");//9
        System.out.println(num3);
        int num4 = str2.indexOf("is")+1; //17 because it will give index of i then we give +1 to find the index number of "s"
        System.out.println(num4);

        int maxIndexnumber = "Cybertek".length()-1;

        System.out.println(maxIndexnumber);//7


        String names = "Gozde";
        int a1 =names.indexOf("Good Guy");
        System.out.println(a1);//-1





    }
}
