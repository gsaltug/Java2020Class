package day36_StaticBlock;

import OfficeHours.Tester;

public class StaticBlock3 {
    static String name;
    static int num;

    static Tester tester1;
    static{
        name="Muhtar";
        num=200;
        tester1.setInfo("Lina", "Dev", 123456,123);
    }
    public static void main(String[] args) {


        System.out.println(name);//Muhtar

        System.out.println(num);//200



    }
}
