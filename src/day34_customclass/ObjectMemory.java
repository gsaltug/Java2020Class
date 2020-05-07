package day34_customclass;

import java.util.ArrayList;
import java.util.Arrays;



public class ObjectMemory {
    int i= 1000;//outside the block, instance variable, located in heep
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,20,30,40));

        ArrayList<Integer> list2 = list1; //Only one object created in heep.Sharing the same object
//Reference name, object name -->list1 for example
        list1.remove(2);
        System.out.println(list1);//[10, 20, 40]
        System.out.println(list2);//[10, 20, 40]

        String str1 = new String("cybertek");
        String str2 = str1;//cybertek--object1
         str1=str1.toUpperCase();//CYBERTEK --object2

        System.out.println(str1);
        System.out.println(str2);

        int i = 300; //memory local variable-- stack
    //Class not in memory

    }

}
