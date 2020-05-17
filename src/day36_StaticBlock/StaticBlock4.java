package day36_StaticBlock;

import OfficeHours.Tester;

public class StaticBlock4 {
    static String name;
    static Tester tester1 = new Tester();



    static{
        name="Caybertek School";
    }

    public static void main(String[] args) {
        System.out.println(name);//Caybertek School
        System.out.println(tester1);

    }


}
